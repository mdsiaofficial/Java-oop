/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_Handling;

class ArithmaticException {
    public static void main(String args[]) {
        try{
            int a = 0;
            int b = 4 / a;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
}
