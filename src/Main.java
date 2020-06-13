import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(x(4, 20));
    }


    //metodo que nos indica si puede atender esa orden dependiendo de su tag o si alguien de menor jerarquia puede hacerlo

    public static List<Integer> x(int odTag, int odIte) {
        List<Integer> rappitenderTag = new ArrayList<>();
        for (Integer it : Constants.TAGITERATION.get(iteratorRange(odIte))) {
            if (it <= odTag) {
                rappitenderTag.add(it);
            }
        }
        return rappitenderTag;
    }

    // determina a que rango de iteraciones pertenece dependiendo de las condiciones que tenemos predeterminadas
    public static int iteratorRange(int ite) {
        int val = 0;
        if (ite >= 15) {
            val = 15;
            System.out.println("15");

        } else if ((ite >= 10)) {
            val = 10;
            System.out.println("10");
        } else if ((ite >= 5)) {
            val = 5;
            System.out.println("5");
        } else {
            val = 0;
            System.out.println("0");
        }
        return val;
    }

}



/*
2- Considere una orden y un rappitendero, cada uno con un tag de complejidad asociado. Por cada ciclo en el tiempo,
 el tag de las órdenes puede ser menos riguroso para que otros rappitenderos puedan realizarla, abriendo las posibilidades de busqueda.
Ejemplo:
Orden:

tag: 4
iteration: 0

tag: 4, 3 (nivel 3 abierto)
iteration: 5

tag: 4, 3, 2 (nivel 3 y 2 abiertos)
iteration: 10

tag: 4, 3, 2, 1 (nivel 3, 2 y 1 abiertos)
iteration: 15

Basandose en esta configuracion:
config = {
   "1": 15,
   "2": 10,
   "3": 5,
   "4": 0
}

Resultado:
>> x(od_tag=4, od_ite=0)  = [4]
>> x(od_tag=4, od_ite=5)  = [4, 3]
>> x(od_tag=4, od_ite=10) = [4, 3, 2]
>> x(od_tag=4, od_ite=15) = [4, 3, 2, 1]

 */