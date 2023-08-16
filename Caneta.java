public class Caneta {
 
    
private String modelo;
private float ponta;
private String cor = "Azul";
private boolean tampada;

<<<<<<< HEAD
public  Caneta(String m, String c, float p){ //Este é o método construtor
=======
//O construtor tem o mesmo nome da classe

 
public  Caneta(){ //Este é o método construtor
>>>>>>> f8020dcbc0e324c03d2f97c1fd6ce17adfd4e7db


this.tampar();
this.modelo = m;
this.cor = c; 
this.ponta = p;



}


public String getModelo(){

    return this.modelo;
}


public void setModelo(String modelo){


    this.modelo = modelo;

}

public float getPonta(){

    return this.ponta;
}

public void setPonta(float ponta){

    this.ponta = ponta;
}


public void tampar()  {

    this.tampada = true;    
}



public void destampar(){

    this.tampada = false;
}


//Metodo
public void status(){

    System.out.println("Sobre a caneta: ");
    System.out.println("Modelo: " + this.getModelo());
    System.out.println("Ponta: " + this.getPonta());
    System.out.println("Cor: " + this.cor);
    System.out.println("Tampada: " + this.tampada);

}


}
