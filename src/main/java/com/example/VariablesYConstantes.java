// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.example;

class VariablesYConstantes {
   VariablesYConstantes() {
   }

   public static void demostrarDeclaracionAsignacion() {
      String var0 = "Gabi";
      byte var1 = 18;
      double var2 = 1.67;
      char var4 = 'F';
      boolean var5 = true;
      System.out.println("Nombre: " + var0);
      System.out.println("Edad: " + var1);
      System.out.println("Altura: " + var2);
      System.out.println("Género: " + var4);
      System.out.println("¿Es estudiante?: " + var5);
   }

   public static void demostrarConvencionesNombres() {
      byte var0 = 30;
      double var1 = 25.99;
      boolean var3 = true;
      System.out.println("\nEjemplos camelCase:");
      System.out.println("numeroEstudiantes: " + var0);
      System.out.println("precioProducto: " + var1);
      System.out.println("estaActivo: " + var3);
   }

   public static void demostrarConstantes() {
      System.out.println("\nConstantes:");
      System.out.println("PI: 3.1416");
      System.out.println("Días de la semana: 7");
   }
}
