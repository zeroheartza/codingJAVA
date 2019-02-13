
        try {
            result = (int) (num1 / num2);
            System.out.println("Print from try");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Print from catch");
        } 
        return result;
    }
}