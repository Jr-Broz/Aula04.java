public class Caneta {
 
    
private String modelo;
private float ponta;
private String cor = "Azul";
private boolean tampada;

//O construtor tem o mesmo nome da classe

 
public  Caneta(){ //Este é o método construtor


this.tampar();
this.cor = "Azul";
this.modelo = "Bic";
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
