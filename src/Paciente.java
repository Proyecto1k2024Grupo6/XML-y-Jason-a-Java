public class Paciente {
    // Atributos de la clase Paciente
    private int sip;
    private String nombre;
    private String dni;
    private String telefono;
    private String nac;

    // Constructor de la clase Paciente
    public Paciente(int sip, String nombre, String dni, String telefono, String nac) {
        this.sip = sip;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.nac = nac;
    }

    // Metodo para convertir los datos del paciente en formato JSON
    public String toJson() {
        // StringBuilder para construir el JSON
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"sip\": ").append(sip).append(",\n")  // Añade el SIP del paciente
                .append(" \"nombre\": \"").append(nombre).append("\",\n")  // Añade el nombre
                .append(" \"dni\": \"").append(dni).append("\",\n")  // Añade el DNI
                .append(" \"telefono\": \"").append(telefono).append("\",\n")  // Añade el teléfono
                .append(" \"nac\": \"").append(nac).append("\"\n")  // Añade la fecha de nacimiento
                .append("}");
        return jsonBuilder.toString();  // Retorna la cadena JSON
    }

    // Metodo para convertir los datos del paciente en formato XML
    public String toXml() {
        // StringBuilder para construir el XML
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Paciente>\n")
                .append(" <sip>").append(sip).append("</sip>\n")  // Añade el SIP
                .append(" <nombre>").append(nombre).append("</nombre>\n")  // Añade el nombre
                .append(" <dni>").append(dni).append("</dni>\n")  // Añade el DNI
                .append(" <telefono>").append(telefono).append("</telefono>\n")  // Añade el teléfono
                .append(" <nac>").append(nac).append("</nac>\n")  // Añade la fecha de nacimiento
                .append("</Paciente>");
        return xmlBuilder.toString();  // Retorna la cadena XML
    }
}