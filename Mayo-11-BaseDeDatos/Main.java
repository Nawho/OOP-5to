public class Main {
    public static void main(String[] args){
        AccesoBaseDeDatos db = new AccesoBaseDeDatos("Pokemon", "pokemon");
        db.conectar("root", "");
        db.modificarTabla("insert into Pokemon (pkname, type1, type2) values ('Charizard', 1, 2);");
        db.modificarTabla("insert into Pokemon (pkname, type1, type2) values ('Blastoise', 3, 7);");
        db.modificarTabla("insert into Pokemon (pkname, type1, type2) values ('Venosaur', 10, 15);");

        db.modificarTabla("update Pokemon set pkname = 'Fire Dragon' where type1 = 1;");
        db.modificarTabla("update Pokemon set type1 = 6 where pkname = 'Blastoise';");
        db.modificarTabla("delete from Pokemon where pkname = 'Venosaur';");
        db.imprimirDatos();
    }
}
