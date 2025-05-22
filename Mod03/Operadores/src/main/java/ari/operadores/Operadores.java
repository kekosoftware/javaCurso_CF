package ari.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int variableX = 50, variableY = 10;
        int resultado;

        resultado = variableX + variableY;
        System.out.println("Resultado de suma: " + resultado);

        resultado = variableX - variableY;
        System.out.println("Resultado de resta: " + resultado);

        resultado = variableX * variableY;
        System.out.println("Resultado de multiplicación: " + resultado);

        resultado = variableX / variableY;
        System.out.println("Resultado de división: " + resultado);

        variableX = 50;
        variableX++;
        System.out.println("VariableX de incremento en 1 con doble +: " + variableX);

        variableX = 50;
        variableX--;
        System.out.println("VariableX de decrementar en 1 con doble -: " + variableX);

        variableX = 50;
        variableX += 100;
        System.out.println("VariableX incrementado en 100 con += " + variableX);

        variableX = 50;
        variableX *= 3;
        System.out.println("VariableX multiplicado x 3 (*=) = " + variableX);


        // Casting
        variableX = 50;
        int resultadoCasting;
        float variableZ = 5.5f;

        resultadoCasting = variableX + (int)variableZ;

        System.out.println("Resultado de Casting a int: " + resultadoCasting);
        System.out.println("Variable 5.5f casteado: " + (int)variableZ);

        // Operadores Relacionales
        // >, <, >=, <=, !=
        int variable1 = 300, variable2 = 200;
        boolean resultadoRel;

        resultadoRel = variable1 > variable2;
        System.out.println("Comparación entre var1(300) > var2 (200): " + resultadoRel);

        // Operadores lógico
        //  and, or y not
        boolean resultadoLogico;

        resultadoLogico = 5 >= 5 && true && 10 > 9;
        System.out.println("Resultado Operador Lógico: " + resultadoLogico);

        resultadoLogico = false || false || true;
        System.out.println("Resultado Operador Lógico: " + resultadoLogico);

        resultadoLogico = (5 >= (2*3) || true) && (true && 10 > 5);
        System.out.println("Resultado Operador Lógico: " + resultadoLogico);

        System.out.println("Resultado Operador Lógico: " + !false);

        // Operador Ternario IFTTT
        String mensaje = 10 > 9 ? "Es mayor" : "Es menor";
        System.out.println("10 > 9 con operdor ternario: " + mensaje);

        int enteros = true ? 1 : 0;
        System.out.println("true es: " + enteros);

    }
}
