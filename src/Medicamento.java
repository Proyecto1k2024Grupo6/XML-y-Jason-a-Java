public class Medicamento {
    // Atributos de la clase Medicamento
    private int id;
    private String nombre;
    private String dosis;
    private String frecuencia;
    private String observaciones;

    // Constructor de la clase Medicamento
    public Medicamento(int id, String nombre, String dosis, String frecuencia, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.observaciones = observaciones;
    }

    // Metodo para convertir los datos del medicamento en formato JSON
    public String toJson() {
        // StringBuilder para construir el JSON
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"id\": ").append(id).append(",\n")  // Añade el ID del medicamento
                .append(" \"nombre\": \"").append(nombre).append("\",\n")  // Añade el nombre
                .append(" \"dosis\": \"").append(dosis).append("\",\n")  // Añade la dosis
                .append(" \"frecuencia\": \"").append(frecuencia).append("\",\n")  // Añade la frecuencia
                .append(" \"observaciones\": \"").append(observaciones).append("\"\n")  // Añade las observaciones
                .append("}");
        return jsonBuilder.toString();  // Retorna la cadena JSON
    }

    // Metodo para convertir los datos del medicamento en formato XML
    public String toXml() {
        // StringBuilder para construir el XML
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Medicamento>\n")
                .append(" <id>").append(id).append("</id>\n")  // Añade el ID del medicamento
                .append(" <nombre>").append(nombre).append("</nombre>\n")  // Añade el nombre
                .append(" <dosis>").append(dosis).append("</dosis>\n")  // Añade la dosis
                .append(" <frecuencia>").append(frecuencia).append("</frecuencia>\n")  // Añade la frecuencia
                .append(" <observaciones>").append(observaciones).append("</observaciones>\n")  // Añade las observaciones
                .append("</Medicamento>");
        return xmlBuilder.toString();  // Retorna la cadena XML
    }
}