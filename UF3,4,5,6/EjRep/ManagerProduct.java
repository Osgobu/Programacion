package EjRep;

import java.util.HashMap;
import java.util.ArrayList;



class ManagerProduct{


    HashMap<Integer, Product> products;

    public ManagerProduct(){
        products=new HashMap<Integer, Product>();
    }

    public void addProduct(int id, String nom, double preu) throws ProductAlreadyExistsException{    
        if( products.containsKey(id)){
            throw new ProductAlreadyExistsException();

        }
        else{
            Product producte=new Product(id, nom, preu);
            products.put(producte.getId(),producte);
        }


    }

    public void deleteProduct(int id){
        products.remove(id);
    }

    public void seeProduct(){
        products.forEach((key, producte)->{
            System.out.println(producte);
        }
        );
    }
}