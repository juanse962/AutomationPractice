package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LoginManagement {
    public static final Target INFO= Target.the("Seleccioanr el login")
            .locatedBy("//div[@id='cmsinfo_block']//li[1]//h3");
    public static final Target SIGN_IN= Target.the("Seleccioanr el login")
            .locatedBy("//a[contains(text(),'Sign in')]");
    public static final Target INPUT_EMAIL = Target.the("Seleccionar input del email")
            .locatedBy("//input[@id='email_create']");
    public static final Target BUTTON_LOGIN = Target.the("Hace click en el boton para iniciar sesion")
            .locatedBy("//button[@id='SubmitCreate']");
    public static final Target SELECT_MR = Target.the("Hace click en el radio button de MR")
            .locatedBy("//input[@id='id_gender1']");
    public static final Target SELECT_MRS = Target.the("Hace click en el radio button de MR")
            .locatedBy("//*[@id='id_gender2']");
    public static final Target INPUT_NAME = Target.the("Seleccionar input name")
            .locatedBy("#customer_firstname");
    public static final Target INPUT_LAST_NAME = Target.the("Seleccionar input de last name")
            .locatedBy("#customer_lastname");
    public static final Target INPUT_CONFIRM_EMAIL = Target.the("Seleccionar input de last name")
            .locatedBy("//input[@id='email']");
    public static final Target INPUT_PASS = Target.the("Seleccionar input de password")
            .locatedBy("#passwd");
    public static final Target SELECT_DAY = Target.the("Selecciona el dia de nacimiento")
            .locatedBy("//select[@id='days']/option[{0}]");
    public static final Target SELECT_MONTH = Target.the("Selecciona el mes de nacimiento")
            .locatedBy("//option[contains(text(),'{0}')]");
    public static final Target SELECT_YEAR = Target.the("Selecciona el año de nacimiento")
            .locatedBy("//option[contains(text(),'{0}')]");
    public static final Target SELECT_CHECK_NEWSLETTER = Target.the("Selecciona check de newsletter")
            .locatedBy("#newsletter");
    public static final Target SELECT_CHECK_PARTNERS = Target.the("Selecciona check de partners")
            .locatedBy("#optin");
    public static final Target INPUT_FIRST_NAME_ADDRESS = Target.the("Ingresa primer nombre conocido")
            .locatedBy("//input[@id='firstname']");
    public static final Target INPUT_LAST_NAME_ADDRESS = Target.the("Ingresa appellido conocido")
            .locatedBy("//input[@id='lastname']");
    public static final Target INPUT_COMPANY = Target.the("Escribe el nombre de la compañia")
            .locatedBy("//input[@id='company']");
    public static final Target INPUT_ADDRESS_1 = Target.the("Escribe address 1")
            .locatedBy("//input[@id='address1']");
    public static final Target INPUT_ADDRESS_2 = Target.the("Escribe address 2")
            .locatedBy("//input[@id='address2']");
    public static final Target INPUT_CITY = Target.the("Escribe las ciudad")
            .locatedBy("//input[@id='city']");
    public static final Target STATE_LIST = Target.the("Seleccionar la lista de estados")
            .locatedBy("#id_state");
    public static final Target STATE_SELECT = Target.the("Selecciona un estado")
            .locatedBy("//option[contains(text(),'{0}')]");
    public static final Target POSTAL_CODE_ZIP = Target.the("Escribe el codigo postal")
            .locatedBy("//input[@id='postcode']");
    public static final Target COUNTRY_LIST = Target.the("Selecciona la lista de paises")
            .locatedBy("#id_country");
    public static final Target COUNTRY_USA = Target.the("Seleccionar el pais")
            .locatedBy("//select[@id='id_country']/option[2]");
    public static final Target OTHER_INPUT = Target.the("Escribe otro dato")
            .locatedBy("#other");
    public static final Target HOME_PHONE_INPUT = Target.the("Escribe el telefono de la casa")
            .locatedBy("//input[@id='phone']");
    public static final Target PHONE_MOBILE_INPUT= Target.the("Escribe el telefono celular")
            .locatedBy("#phone_mobile");
    public static final Target ALIAS_ADDRESS_INPUT= Target.the("Alias apra recordad la direccion")
            .locatedBy("//input[@id='alias']");
    public static final Target REGISTRY_BUTTON= Target.the("Seleccionar el boton de registrar")
            .locatedBy("#submitAccount");
    public static final Target HOME_PAGE= Target.the("Visualiza el texto Home Page de bienvenida")
            .locatedBy("//h1");
}