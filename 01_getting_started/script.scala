object HelloWorld {
    /* This is my first java program.
    This will print 'Hello World' as the output
    */
    def main(args: Array[String]) {
        println("Hello, world") //prints helloworld
        var myIntVar :Int = 5;
        var myStrVar :String = "line";

        val immutbleIntVar :Int = 7;
        val immutebleStrVar :String = "new_line";

        var intVar = 10;
        val strVar = "hello";

        val (myVar1: Int, vyVar2: String) = Pair(40, "foo");
    }
}