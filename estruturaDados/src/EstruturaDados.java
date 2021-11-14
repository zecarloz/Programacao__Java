public class EstruturaDados {
    public static void main(String[] args) {
        int [] vetorzao = new int[10];

        vetorzao[0]=3;
        vetorzao[1]=4;
        vetorzao[2]=8;
        vetorzao[3]=13;
        vetorzao[4]=22;
        vetorzao[5]=51;
        vetorzao[6]=33;
        vetorzao[7]=0;
        vetorzao[8]=0;
        vetorzao[9]=1;
        for (int i = 0 ; i < vetorzao.length ; i++ ){
            System.out.println("posição " + i + " = " +  vetorzao [i]);
        }
        
    }
}


