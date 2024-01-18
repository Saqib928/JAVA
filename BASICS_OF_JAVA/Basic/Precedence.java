package BASICS_OF_JAVA.Basic;

public class Precedence {
    public static void main(String[] args) {
        /*
        Postfix: expr++, expr--
Unary: ++expr, --expr, +expr, -expr, ~, !
Multiplicative: *, /, %
Additive: +, -
Shift: <<, >>, >>>
Relational: <, <=, >, >=, instanceof
Equality: ==, !=
Bitwise AND: &
Bitwise XOR: ^
Bitwise OR: |
Logical AND: &&
Logical OR: ||
Conditional (Ternary): ? :
Assignment and compound assignment operators

Precedence:

++ --
+ - ! ~
* / %
+ -
<< >> >>>
< <= > >= instanceof
== !=
&
^
|
&&
||
? :
= += -= *= /= %= &= ^= |= <<= >>= >>>=
Associativity:

Left-associative: ++ -- + - * / % << >> >>> < <= > >= == != & ^ | && || ? : = += -= *= /= %= &= ^= |= <<= >>= >>>=
Right-associative: = += -= *= /= %= &= ^= |= <<= >>= >>>=
         */int a = 5;
         int b = 7;
         int c = 12;
         int factor = (b*b-4*a*c)/(2*a);
         System.out.println("the factor for given expression is : "+ factor);
    }
}
