public class Doctor {
    // Atributos de la clase Doctor
    private String nombre;
    private String especialidad;
    private int telefono;
    private String email;
    private String dni;

    // Constructor de la clase Doctor, que inicializa los atributos
    public Doctor(String nombre, String especialidad, int telefono, String email, String dni) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
    }

    // Metodo para convertir los datos del doctor en formato JSON
    public String toJson() {
        // StringBuilder para construir el JSON
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n")
                .append(" \"nombre\": \"").append(nombre).append("\",\n")   // Añade el nombre
                .append(" \"especialidad\": \"").append(especialidad).append("\",\n")  // Añade la especialidad
                .append(" \"telefono\": ").append(telefono).append(",\n")   // Añade el teléfono
                .append(" \"email\": \"").append(email).append("\",\n")   // Añade el email
                .append(" \"dni\": \"").append(dni).append("\"\n")         // Añade el DNI
                .append("}");
        return jsonBuilder.toString();  // Retorna la cadena JSON
    }

    // Metodo para convertir los datos del doctor en formato XML
    public String toXml() {
        // StringBuilder para construir el XML
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<Doctor>\n")
                .append(" <nombre>").append(nombre).append("</nombre>\n")  // Añade el nombre
                .append(" <especialidad>").append(especialidad).append("</especialidad>\n")  // Añade la especialidad
                .append(" <telefono>").append(telefono).append("</telefono>\n")  // Añade el teléfono
                .append(" <email>").append(email).append("</email>\n")  // Añade el email
                .append(" <dni>").append(dni).append("</dni>\n")  // Añade el DNI
                .append("</Doctor>");
        return xmlBuilder.toString();  // Retorna la cadena XML
    }
}