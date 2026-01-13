public class ProductDescription {
    // 私有成员变量（商品ID、价格、描述）
    private int id;
    private double price;
    private String description;

    // 构造方法：初始化商品信息
    public ProductDescription(int id, double price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    // 获取商品ID的方法
    public int getId() {
        return id;
    }

    // 获取商品价格的方法
    public double getPrice() {
        return price;
    }

    // 获取商品描述的方法
    public String getDescription() {
        return description;
    }

    // 可选：添加main方法用于测试代码功能
    public static void main(String[] args) {
        // 创建商品实例
        ProductDescription product = new ProductDescription(1001, 99.99, "Wireless Bluetooth Headphones");
        // 输出商品信息
        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Price: $" + product.getPrice());
        System.out.println("Product Description: " + product.getDescription());
    }
}
