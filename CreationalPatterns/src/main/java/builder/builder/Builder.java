package builder.builder;

import builder.enumeration.Dough;
import builder.enumeration.Topping;

public interface Builder {
    public void setDough(Dough dough);
    public void addTopping(Topping topping);
    public void setName(String name);
}
