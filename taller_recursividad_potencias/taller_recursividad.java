package taller_recursividad_potencias;
class taller_recursividad{
    public static void main(String[] args) {
        
        int base = 2;
        int potencia = -3;

        System.out.println(potenciacion(base,potencia));
    }

    public static double potenciacion(int base, int potencia){

        if(potencia == 0){
            return 1;
        }
        else if(potencia == 1){
            return base;
        }
        //este caso aplica cuando potenia es negativa, 
        else if(potencia < 0){
            return potenciacion(base, potencia+1)/base;
        }
        else{
            return base * potenciacion(base, potencia-1);
        }
    }
}