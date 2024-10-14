
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Product_QNAME = new QName("http://soapwebservice.example.com/", "Product");
    private static final QName _FillTheDB_QNAME = new QName("http://soapwebservice.example.com/", "fillTheDB");
    private static final QName _FillTheDBResponse_QNAME = new QName("http://soapwebservice.example.com/", "fillTheDBResponse");
    private static final QName _GetProduct_QNAME = new QName("http://soapwebservice.example.com/", "getProduct");
    private static final QName _GetProductList_QNAME = new QName("http://soapwebservice.example.com/", "getProductList");
    private static final QName _GetProductListResponse_QNAME = new QName("http://soapwebservice.example.com/", "getProductListResponse");
    private static final QName _GetProductResponse_QNAME = new QName("http://soapwebservice.example.com/", "getProductResponse");
    private static final QName _GetSellingPrice_QNAME = new QName("http://soapwebservice.example.com/", "getSellingPrice");
    private static final QName _GetSellingPriceResponse_QNAME = new QName("http://soapwebservice.example.com/", "getSellingPriceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     * @return
     *     the new instance of {@link Product }
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link FillTheDB }
     * 
     * @return
     *     the new instance of {@link FillTheDB }
     */
    public FillTheDB createFillTheDB() {
        return new FillTheDB();
    }

    /**
     * Create an instance of {@link FillTheDBResponse }
     * 
     * @return
     *     the new instance of {@link FillTheDBResponse }
     */
    public FillTheDBResponse createFillTheDBResponse() {
        return new FillTheDBResponse();
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     * @return
     *     the new instance of {@link GetProduct }
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductList }
     * 
     * @return
     *     the new instance of {@link GetProductList }
     */
    public GetProductList createGetProductList() {
        return new GetProductList();
    }

    /**
     * Create an instance of {@link GetProductListResponse }
     * 
     * @return
     *     the new instance of {@link GetProductListResponse }
     */
    public GetProductListResponse createGetProductListResponse() {
        return new GetProductListResponse();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     * @return
     *     the new instance of {@link GetProductResponse }
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link GetSellingPrice }
     * 
     * @return
     *     the new instance of {@link GetSellingPrice }
     */
    public GetSellingPrice createGetSellingPrice() {
        return new GetSellingPrice();
    }

    /**
     * Create an instance of {@link GetSellingPriceResponse }
     * 
     * @return
     *     the new instance of {@link GetSellingPriceResponse }
     */
    public GetSellingPriceResponse createGetSellingPriceResponse() {
        return new GetSellingPriceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Product }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillTheDB }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FillTheDB }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "fillTheDB")
    public JAXBElement<FillTheDB> createFillTheDB(FillTheDB value) {
        return new JAXBElement<>(_FillTheDB_QNAME, FillTheDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillTheDBResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FillTheDBResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "fillTheDBResponse")
    public JAXBElement<FillTheDBResponse> createFillTheDBResponse(FillTheDBResponse value) {
        return new JAXBElement<>(_FillTheDBResponse_QNAME, FillTheDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductList }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "getProductList")
    public JAXBElement<GetProductList> createGetProductList(GetProductList value) {
        return new JAXBElement<>(_GetProductList_QNAME, GetProductList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "getProductListResponse")
    public JAXBElement<GetProductListResponse> createGetProductListResponse(GetProductListResponse value) {
        return new JAXBElement<>(_GetProductListResponse_QNAME, GetProductListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellingPrice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellingPrice }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "getSellingPrice")
    public JAXBElement<GetSellingPrice> createGetSellingPrice(GetSellingPrice value) {
        return new JAXBElement<>(_GetSellingPrice_QNAME, GetSellingPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSellingPriceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSellingPriceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soapwebservice.example.com/", name = "getSellingPriceResponse")
    public JAXBElement<GetSellingPriceResponse> createGetSellingPriceResponse(GetSellingPriceResponse value) {
        return new JAXBElement<>(_GetSellingPriceResponse_QNAME, GetSellingPriceResponse.class, null, value);
    }

}
