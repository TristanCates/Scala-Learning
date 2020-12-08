object HelloWorld extends App{
  //def main(args: Array[String]): Unit = { {{with extends app we do not need this line}}
    if (args.length == 0)
      println("Usage: HelloWorld [name]")
    else
      println("Hello, " + args(0))
  //}
}
