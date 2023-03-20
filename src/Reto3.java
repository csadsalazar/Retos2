public class Reto3 {
    public static void main(String[] args){

       String[][] numero  = {
            {"Esc","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","Ins","ImpPnt","Supr"},
            {"º","1","2","3","4","5","6","7","8","9","0","?","¿","<-","inicio",""},
            {"<- -> ","Q","W","E","R","T","Y","U","I","O","P","`","*","}","Repag",""},
            {"BlocMay ","A","S","D","F","G","H","J","K","L","ñ","{","<--","Avpag","",""},
            {"^----     ","Z","X","C","V","B","N","M",",",".","-","Pausa","Fin","^","",""},
            {"Ctrl","Fn","Windows","Alt","","","","Espacio","","","","Altgr","<>","<","v",">"}
        };
            
        for(int n = 0; n < 6; n++) {
            for(int j = 0; j < 16; j++) {
                System.out.print(numero[n][j] + "\t");
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
