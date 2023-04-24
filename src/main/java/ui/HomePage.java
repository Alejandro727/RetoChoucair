package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.exito.com/")
public class HomePage extends PageObject {
    public static final Target SELECT_CATEGORY_MENU = Target.the("Seleccionar tipo de categoria").located(By.id("category-menu"));
    public static final Target SELECT_CATEGORY_DORMITORIO = Target.the("Seleccionar tipo de categoria").located(By.id("undefined-nivel2-Dormitorio"));
    public static final Target SELECT_CATEGORY_CABECEROS = Target.the("Seleccionar tipo de categoria").located(By.id("Categorías-nivel3-Cabeceros"));
    //public static final Target productList = Target.the("product list").located(By.xpath("//div[ @id='gallery-layout-container']/div[ @class='vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4']"));
    public static final Target productList = Target.the("product list").located(By.xpath("//span[contains(@class,'w-100 h-100')][normalize-space()='Compra rápida']"));
    public static final Target BTN_CONTINUAR_COMPRANDO = Target.the("Boton continuar comprando").located(By.xpath("//p[@class='exito-vtex-components-4-x-continue']"));

    public static final Target BTN_AGREGAR = Target.the("Boton agregar").located(By.xpath("//button[ @class=\"vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer w-100 \"]"));
    public static final Target BTN_ADICIONAR_PRODUCTO = Target.the("Adicionar mas productos").located(By.xpath("//span[@class='product-details-exito-vtex-components-buy-button-manager-more']"));
    public static final Target BTN_CARRITO_DE_COMPRAS = Target.the("Carrito de compras").located(By.xpath("//a[@class='exito-header-3-x-minicartLink']//*[name()='svg']"));
    public static final Target PRODUCTOS_CARRITO = Target.the("Productos carrito de compras").located(By.xpath("//a[ @class='exito-checkout-product-name']"));
    public static final Target NOMBRE_PRODUCTOS = Target.the("Nombre de los productos seleccionados").located(By.xpath("//div[contains(@class,'w-100 center pt2 pb5')]//span[contains(@class,'vtex-store-components-3-x-productBrand')]"));
}
