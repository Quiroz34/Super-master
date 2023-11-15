package clases;

/**
 *
 * @author 
 */
public class Detalles_Ventas
{

    private int id;
    private int id_Ventas;
    private int id_Productos;
    private int CantidadV;
    private float pesoV;
    private float precio_Total;

    public Detalles_Ventas()
    {
    }

    public Detalles_Ventas(int id, int id_Ventas, int id_Productos, int CantidadV, float precio_Total)
    {
        this.id = id;
        this.id_Ventas = id_Ventas;
        this.id_Productos = id_Productos;
        this.CantidadV = CantidadV;
        this.pesoV = 0;
        this.precio_Total = precio_Total;
    }

    public Detalles_Ventas(int id, int id_Ventas, int id_Productos, float pesoV, float precio_Total)
    {
        this.id = id;
        this.id_Ventas = id_Ventas;
        this.id_Productos = id_Productos;
        this.pesoV = pesoV;
        this.CantidadV = 0;
        this.precio_Total = precio_Total;
    }

    public Detalles_Ventas(int id, int id_Ventas, int id_Productos, int CantidadV, float pesoV, float precio_Total)
    {
        this.id = id;
        this.id_Ventas = id_Ventas;
        this.id_Productos = id_Productos;
        this.CantidadV = CantidadV;
        this.pesoV = pesoV;
        this.precio_Total = precio_Total;
    }
    
    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the id_Productos
     */
    public int getId_Productos()
    {
        return id_Productos;
    }

    /**
     * @param id_Productos the id_Productos to set
     */
    public void setId_Productos(int id_Productos)
    {
        this.id_Productos = id_Productos;
    }

    /**
     * @return the CantidadV
     */
    public int getCantidadV()
    {
        return CantidadV;
    }

    /**
     * @param CantidadV the CantidadV to set
     */
    public void setCantidadV(int CantidadV)
    {
        this.CantidadV = CantidadV;
    }

    /**
     * @return the precio_Total
     */
    public float getPrecio_Total()
    {
        return precio_Total;
    }

    /**
     * @param precio_Total the precio_Total to set
     */
    public void setPrecio_Total(float precio_Total)
    {
        this.precio_Total = precio_Total;
    }

    /**
     * @return the id_Ventas
     */
    public int getId_Ventas()
    {
        return id_Ventas;
    }

    /**
     * @param id_Ventas the id_Ventas to set
     */
    public void setId_Ventas(int id_Ventas)
    {
        this.id_Ventas = id_Ventas;
    }

    /**
     * @return the pesoV
     */
    public float getPesoV()
    {
        return pesoV;
    }

    /**
     * @param pesoV the pesoV to set
     */
    public void setPesoV(float pesoV)
    {
        this.pesoV = pesoV;
    }
}
