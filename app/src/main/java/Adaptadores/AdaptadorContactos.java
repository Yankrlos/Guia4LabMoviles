package Adaptadores;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia4labmoviles.R;

import java.util.List;

import Entidades.Contacto;

public class AdaptadorContactos extends RecyclerView.Adapter<AdaptadorContactos.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtNombre, txtNum, txtOrganizacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtNum = itemView.findViewById(R.id.txtNum);
            txtOrganizacion = itemView.findViewById(R.id.txtOrganizacion);
        }
    }

    public List<Contacto> lstContactos;

    public AdaptadorContactos(List<Contacto> lstContactos){
        this.lstContactos = lstContactos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla_activity, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNombre.setText(this.lstContactos.get(position).getNombre());
        holder.txtNum.setText(this.lstContactos.get(position).getNumero());
        holder.txtOrganizacion.setText(this.lstContactos.get(position).getOrganizacion());
    }

    @Override
    public int getItemCount() {
        return this.lstContactos.size();
    }

}
