class Aula04{

    public static void main(String[] args) {

        Caneta c1 = new Caneta("Nic", "Verde", 0.5f);

        c1.status();
        System.out.println("==============");
        Caneta c2 = new Caneta("PHP", "Roxo", 0.9f);

        c2.status();

    //         //Metodo acessor
    //     c1.setModelo(" Bic ");
        
    //     //Acessar diretamente pelo atributo. Não funciona caso acessibilidade = private
    //    // c1.modelo = "Bic"; 


    //     c1.setPonta( 0.5f);


    //     //Nao pode ser acessado pois tem o modificador de acessibilidade privado
    //     //c1.ponta = 0.9f;


    // System.out.println("Possuo uma caneta" + c1.getModelo() + "de ponta " + c1.getPonta());

    }
}
