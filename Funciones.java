package aed;

class Funciones {

/***  Primera parte: Funciones en java ***/

    int cuadrado(int x) {
            int res;
            res = x*x;
            return res;
    }

    double distancia(double x, double y) {
        double res;
        res = Math.sqrt(x*x + y*y);        
        return res;
    }

    boolean esPar(int n) {
        boolean res;
        if (n%2 == 0){
            res = true;
        } else{
            res = false;
        }    
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res = true;
        if ((n%4 == 0 && n%100 != 0)|| n%400 == 0){
            res = true;
        }
        else {
            res = false;
        }
        return res;
    }

    int factorialIterativo(int n) {
        int res = n;
        int aux = n-1; 
        int contador = 1;
        if (n==0 || n == 1){
            res = 1;
            return res;
        }
        else {
            while (contador != n){
                res = res * aux;
                aux = aux-1;
                contador += 1;
            }    
        }
        return res;
    }

    int factorialRecursivo(int n) {
        if (n==0 || n == 1){
            return 1;
        }
        else {
            return n * factorialRecursivo (n-1);
        } 
    }

    boolean esPrimo(int n) {
        int aux = 2;
        boolean res = true;
        if (n== 1){
            res = false;
            return res;
        }
        while (aux != n){
            if (n%aux == 0) {
                res = false;
            }
            aux+=1;
        }
        return res;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        int contador = 0;
        while (contador != numeros.length){
            res = res + numeros[contador];
            contador +=1;
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        int posicion = 0;
        while (numeros[posicion]!= buscado && posicion != numeros.length)
        {
            posicion +=1;
        }
        return posicion;
    }

    boolean tienePrimo(int[] numeros) {
        int posicion = 0;
        while (posicion != numeros.length){           
            if (esPrimo (numeros[posicion])== true){
                return true;
            }         
            posicion +=1;

        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        int posicion = 0;
        while (posicion != numeros.length){
            if (esPar(numeros[posicion])== false){
                return false;
            }
            posicion +=1; 
        }       
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = false;
        String palabra2recortada = "";
        int tamañopalabra1 = s1.length();
        int tamañopalabra2 = s2.length();
        
        if (tamañopalabra2 < tamañopalabra1){
            return false;
        }

        for (int i = 0; i < tamañopalabra1;i++){
            palabra2recortada = palabra2recortada + s2.charAt(i);
        }

        if (s1.equals(palabra2recortada)) {
            res = true;
        }
        return res;
    }

    boolean esSufijo(String s1, String s2) {
        boolean res = false;
        String palabra2recortada = "";
        int tamañopalabra1 = s1.length();
        int tamañopalabra2 = s2.length();
        int diferencia = tamañopalabra2 - tamañopalabra1;
        
        if (tamañopalabra2 < tamañopalabra1)
        {
            return false;
        }
        
        for (int i = diferencia;i < tamañopalabra2; i ++)
        {
            palabra2recortada = palabra2recortada + s2.charAt(i);
        }
        
        if (s1.equals(palabra2recortada))
        {
            res = true;
        }
        return res;
    }

/***  Segunda parte: Debugging ***/

    boolean xor(boolean a, boolean b) {
        return (a || b) && !(a && b); //Tuve que agregar parentesis porque juntaba las operaciones
    }

    boolean iguales(int[] xs, int[] ys) {
        // Voy a calcular los tamaños de las listas y si son diferentes directamente devuelvo False
        int tamañoxs = xs.length;
        int tamañoys = ys.length;

        boolean res = true;
        if (tamañoxs != tamañoys){
            return false;
        }
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] != ys[i]) {
                res = false;
            }
        }
        return res;
    }

    boolean ordenado(int[] xs) {
        boolean res = true;
        if (xs.length == 1){ // Caso base, si la lista tiene un elemento devuelvo true.
            return true;
        }
        for (int i = 0; i < xs.length -1; i++) { // Agregue un -1 para que que compare hasta la anteultima posicion.
            if (xs[i] > xs [i+1]) { //Se iba out of range ya que xs [i+1] al llegar a la ultima posiscion de xs no tiene nada adelante
                res = false;
            }
        }
        return res;
    }

    int maximo(int[] xs) {
        int res = xs[0]; // Inicio res en el primer elemento de la lista, antes empezaba en 0, si habia negativos fallaba
        if (xs.length == 1){ // Agrego caso base, si la lista tiene solo un elemento, lo devuelve directamente
            res = xs[0];
            return res;
        }
        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > res) res = xs[i]; // Antes res pasaba a ser el valor del indice, no del elemento en la lista.
        }
        return res;
    }

    boolean todosPositivos(int[] xs) {
        boolean res = true; //Cambie mas la logica en este, directamente lo empiezo en true y si encuentra un negativo devuelve false.
        for (int x : xs) {  
            if (x <= 0) {
                return false;
            }
        }
        return res;
    }

}