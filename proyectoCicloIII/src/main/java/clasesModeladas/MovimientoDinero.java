package clasesModeladas;

public class MovimientoDinero {

    // atributos
    int id;
    String Concept;
    Double Amount;
    String User;
    //String typeTran;

    // atributo typeTran (tipo de transaccion)

    public enum typeTran {
        Ingreso,
        Egreso
    }

    typeTran tipo;

    // metodo constructor
    public MovimientoDinero(int id, String Concept, Double Amount, String User, typeTran tipo) {
        this.id = id;
        this.Concept = Concept;
        this.Amount = Amount;
        this.User = User;
        // this.transactionType = transactionType;
        this.tipo = tipo;
    }


    // getters y setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcept() {
        return Concept;
    }

    public void setConcept(String Concept) {
        this.Concept = Concept;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    //public String getTypeTran() {
    //    return typeTran;
    //}

    //public void setTypeTran(String typeTran) {
    //    this.typeTran = typeTran;
    //}


    public typeTran getTipo() {
        return tipo;
    }

    public void setTipo(typeTran tipo) {
        this.tipo = tipo;
    }
}
