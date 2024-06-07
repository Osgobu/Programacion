package EjRep;

class ProductAlreadyExistsException extends Exception{
    public ProductAlreadyExistsException(){
        super("Este ya existe");
    }
}