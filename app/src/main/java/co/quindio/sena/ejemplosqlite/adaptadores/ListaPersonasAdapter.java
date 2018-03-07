package co.quindio.sena.ejemplosqlite.adaptadores;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import co.quindio.sena.ejemplosqlite.R;
import co.quindio.sena.ejemplosqlite.entidades.Usuario;



public class ListaPersonasAdapter extends RecyclerView.Adapter<ListaPersonasAdapter.PersonasViewHolder> {

    ArrayList<Usuario> listaUsuario;
    private Context mContext;

    public ListaPersonasAdapter(ArrayList<Usuario> listaUsuario, Context mContext) {
        this.listaUsuario = listaUsuario;
        this.mContext = mContext;
    }

    @Override
    public PersonasViewHolder onCreateViewHolder( ViewGroup parent,  int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_personas,null,false);
        return new PersonasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PersonasViewHolder holder, final int position) {
        holder.clave.setText(listaUsuario.get(position).getId().toString());
        holder.nombre.setText(listaUsuario.get(position).getNombre());
        holder.sueldo.setText(listaUsuario.get(position).getSueldo().toString());
        holder.txtOptionDigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Display option menu

                PopupMenu popupMenu = new PopupMenu(mContext, holder.txtOptionDigit);
                popupMenu.inflate(R.menu.option_menu);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.borrar:
                                Toast.makeText(mContext, "Eliminado", Toast.LENGTH_LONG).show();
                                listaUsuario.remove(position);
                                notifyDataSetChanged();
                                break;
                            case R.id.modificar:
                                //Delete item
                                Toast.makeText(mContext, "Modificado", Toast.LENGTH_LONG).show();
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaUsuario.size();
    }

    public class PersonasViewHolder extends RecyclerView.ViewHolder {

        TextView clave,nombre,sueldo;
        public TextView txtOptionDigit;

        public PersonasViewHolder(View itemView) {
            super(itemView);
            clave = (TextView) itemView.findViewById(R.id.txtClave);
            nombre = (TextView) itemView.findViewById(R.id.txtNombre);
            sueldo = (TextView) itemView.findViewById(R.id.txtSueldo);
            txtOptionDigit = (TextView) itemView.findViewById(R.id.txtOptionDigit);
        }
    }
}
