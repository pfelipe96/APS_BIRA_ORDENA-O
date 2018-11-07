public class CriarVetor {

    private int lenght;

    CriarVetor(int lenght){
        this.lenght = lenght;
    }


    public int getLenght() {
        return lenght;
    }


    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int[] getVetorCriado(){
        return criaVetor(lenght);
    }

    private int[] criaVetor(int lenght){
        int vetor[] = new int[lenght];

        for(int i = 0; i < lenght;  i++){
            int value = parseToInt(Math.random()*11);
            vetor[i] = value;
        }

        return vetor;
    }

    private int parseToInt(Double value){
        return value.intValue();
    }

}
