package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppingManagement {
    public static final Target SHOPPING_CART= Target.the("Seleccioanr el login")
            .locatedBy("//b[text()='Cart']");
    public static final Target ADD_TO_CART= Target.the("Agregar item al carrito")
                .locatedBy("//ul[@id='homefeatured']/li[{0}]//span[text()= 'Add to cart']");
    public static final Target CONTINUE_SHOPPING= Target.the("Agregar item al carrito")
            .locatedBy(".button-container > span > span > i");
    public static final Target IMAGE_ONE= Target.the("Image hover")
            .locatedBy("//ul[@id='homefeatured']/li[1]//h5/a");
    public static final Target IMAGE_TWO= Target.the("Image hover")
            .locatedBy("//ul[@id='homefeatured']/li[2]//h5/a");
    public static final Target PRICE= Target.the("Image hover")
            .locatedBy("//ul[@id='homefeatured']/li[1]//div[2]/div[1]/span");
}