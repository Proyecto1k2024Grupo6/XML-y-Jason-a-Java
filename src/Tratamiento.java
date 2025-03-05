public class Tratamiento {
    // Atributos de la clase Tratamiento
    private int duracion;
    private String fechaInicio;
    private String fechaFinal;
    private String efectosSecundarios;

    // Constructor de la clase Tratamiento
    public Tratamiento(int duracion, String fechaInicio, String fechaFinal, String efectosSecundarios) {
        this.duracion = duracion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.efectosSecundarios = efectosSecundarios;
    }

    // Metodo para convertir los datos del tratamiento en formato JSON
    public String toJson() {
        // StringBuilder para construir el JSON
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"duracion\": ").append(duracion).append(",\n")  // Añade la duración del tratamiento
                .append(" \"fechaInicio\": \"").append(fechaInicio).append("\",\n")  // Añade la fecha de inicio
                .append(" \"fechaFinal\": \"").append(fechaFinal).append("\",\n")  // Añade la fecha de finalización
                .append(" \"efectosSecundarios\": \"").append(efectosSecundarios).append("\"\n")  // Añade los efectos secundarios
                .append("}");
        return jsonBuilder.toString();  // Retorna la cadena JSON
    }

    // Metodo para convertir los datos del tratamiento en formato XML
    public String toXml() {
        // StringBuilder para construir el XML
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Tratamiento>\n")
                .append(" <duracion>").append(duracion).append("</duracion>\n")  // Añade la duración
                .append(" <fechaInicio>").append(fechaInicio).append("</fechaInicio>\n")  // Añade la fecha de inicio
                .append(" <fechaFinal>").append(fechaFinal).append("</fechaFinal>\n")  // Añade la fecha final
                .append(" <efectosSecundarios>").append(efectosSecundarios).append("</efectosSecundarios>\n")  // Añade los efectos secundarios
                .append("</Tratamiento>");
        return xmlBuilder.toString();  // Retorna la cadena XML
    }
}