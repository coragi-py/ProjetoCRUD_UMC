package modelo;

/**
 * @author Fabio Saruwataru
 */
public class produto {
    
    private int id;
    private String nome;
    private String descricao;
    private String marca;
    private String modelo;
    private String serialNumber;
    private int quantidade;
    private double valor_varejo;
    private double valor_atacado;
    private String categoria;
    private String cor;
    
    /*Setter and Getters*/
    
    public void setIdItem(int id){
        this.id = id;
    }
    public int getIdItem(){
        return id;
    }
    public void setNomeItem(String nome){
        this.nome = nome;
    }
    
    public String getNomeItem(){
        return nome;
    }
    
    public void setDescricaoItem(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricaoItem(){
        return descricao;
    }
    
    public void setMarcaItem(String marca){
        this.marca = marca;
    }
    
    public String getMarcaItem(){
        return marca;
    }
    
    public void setModeloItem(String modelo){
        this.modelo = modelo;
    }
    
    public String getModeloItem(){
        return modelo;
    }
    
    public void setSerialNumberItem(String serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public String getSerialNumberItem(){
        return serialNumber;
    }
    
    public void setQuantidadeItem(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidadeItem(){
        return quantidade;
    }
    
    public void setValorVarejoItem(double valor_varejo){
        this.valor_varejo = valor_varejo;
    }
    
    public double getValorVarejoItem(){
        return valor_varejo;
    }
    
    public void setValorAtacadoItem(double valor_atacado){
        this.valor_atacado = valor_atacado;
    }
    
    public double getValorAtacadoItem(){
        return valor_atacado;
    }
    
    public void setCategoriaItem(String categoria){
        this.categoria = categoria;
    }
    
    public String getCategoriaItem(){
        return categoria;
    }
    
    public void setCorItem(String cor){
        this.cor = cor;
    }
    
    public String getCorItem(){
        return cor;
    }
    
    
}
