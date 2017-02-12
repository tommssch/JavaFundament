package Task7;

import java.lang.annotation.*;

@Documented
@Target(value= ElementType.TYPE)

public @interface Atom{

    String name();

}
