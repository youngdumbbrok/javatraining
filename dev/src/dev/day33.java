package dev;
public final class base {

String Method() {

return "Wow";

}

}

class derived {

public void useD()

{

base z = new base();

System.out.println("base says, " + z.Method());

}

}

