/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Mauricio
 */
@Entity
@Table(name = "itemagro", catalog = "ebella", schema = "")
@NamedQueries({
    @NamedQuery(name = "Itemagro.findAll", query = "SELECT i FROM Itemagro i"),
    @NamedQuery(name = "Itemagro.findByItem", query = "SELECT i FROM Itemagro i WHERE i.item = :item"),
    @NamedQuery(name = "Itemagro.findByDescricao", query = "SELECT i FROM Itemagro i WHERE i.descricao = :descricao"),
    @NamedQuery(name = "Itemagro.findByReferencia", query = "SELECT i FROM Itemagro i WHERE i.referencia = :referencia"),
    @NamedQuery(name = "Itemagro.findByGrupo", query = "SELECT i FROM Itemagro i WHERE i.grupo = :grupo"),
    @NamedQuery(name = "Itemagro.findByUnidade", query = "SELECT i FROM Itemagro i WHERE i.unidade = :unidade"),
    @NamedQuery(name = "Itemagro.findByTributacao", query = "SELECT i FROM Itemagro i WHERE i.tributacao = :tributacao"),
    @NamedQuery(name = "Itemagro.findByClasfiscal", query = "SELECT i FROM Itemagro i WHERE i.clasfiscal = :clasfiscal"),
    @NamedQuery(name = "Itemagro.findByProduzido", query = "SELECT i FROM Itemagro i WHERE i.produzido = :produzido"),
    @NamedQuery(name = "Itemagro.findByImportado", query = "SELECT i FROM Itemagro i WHERE i.importado = :importado"),
    @NamedQuery(name = "Itemagro.findByServico", query = "SELECT i FROM Itemagro i WHERE i.servico = :servico"),
    @NamedQuery(name = "Itemagro.findByNrocodbar", query = "SELECT i FROM Itemagro i WHERE i.nrocodbar = :nrocodbar"),
    @NamedQuery(name = "Itemagro.findByAtivo", query = "SELECT i FROM Itemagro i WHERE i.ativo = :ativo"),
    @NamedQuery(name = "Itemagro.findByLotectrl", query = "SELECT i FROM Itemagro i WHERE i.lotectrl = :lotectrl"),
    @NamedQuery(name = "Itemagro.findByPesobruto", query = "SELECT i FROM Itemagro i WHERE i.pesobruto = :pesobruto"),
    @NamedQuery(name = "Itemagro.findByPesoliquido", query = "SELECT i FROM Itemagro i WHERE i.pesoliquido = :pesoliquido"),
    @NamedQuery(name = "Itemagro.findByRegistroma", query = "SELECT i FROM Itemagro i WHERE i.registroma = :registroma"),
    @NamedQuery(name = "Itemagro.findByDescmaximo", query = "SELECT i FROM Itemagro i WHERE i.descmaximo = :descmaximo"),
    @NamedQuery(name = "Itemagro.findByEstoqueminimo", query = "SELECT i FROM Itemagro i WHERE i.estoqueminimo = :estoqueminimo"),
    @NamedQuery(name = "Itemagro.findByEmbfert", query = "SELECT i FROM Itemagro i WHERE i.embfert = :embfert"),
    @NamedQuery(name = "Itemagro.findByEmbagrotoxico", query = "SELECT i FROM Itemagro i WHERE i.embagrotoxico = :embagrotoxico"),
    @NamedQuery(name = "Itemagro.findByEmbsemente", query = "SELECT i FROM Itemagro i WHERE i.embsemente = :embsemente"),
    @NamedQuery(name = "Itemagro.findByNumerocm", query = "SELECT i FROM Itemagro i WHERE i.numerocm = :numerocm"),
    @NamedQuery(name = "Itemagro.findByPercoperterc", query = "SELECT i FROM Itemagro i WHERE i.percoperterc = :percoperterc"),
    @NamedQuery(name = "Itemagro.findByMultiplo", query = "SELECT i FROM Itemagro i WHERE i.multiplo = :multiplo"),
    @NamedQuery(name = "Itemagro.findByComplemento", query = "SELECT i FROM Itemagro i WHERE i.complemento = :complemento"),
    @NamedQuery(name = "Itemagro.findByMarca", query = "SELECT i FROM Itemagro i WHERE i.marca = :marca"),
    @NamedQuery(name = "Itemagro.findByEbalanca", query = "SELECT i FROM Itemagro i WHERE i.ebalanca = :ebalanca"),
    @NamedQuery(name = "Itemagro.findByCdtipolancto", query = "SELECT i FROM Itemagro i WHERE i.cdtipolancto = :cdtipolancto"),
    @NamedQuery(name = "Itemagro.findByDatacadastro", query = "SELECT i FROM Itemagro i WHERE i.datacadastro = :datacadastro"),
    @NamedQuery(name = "Itemagro.findByCulturaid", query = "SELECT i FROM Itemagro i WHERE i.culturaid = :culturaid"),
    @NamedQuery(name = "Itemagro.findByKit", query = "SELECT i FROM Itemagro i WHERE i.kit = :kit"),
    @NamedQuery(name = "Itemagro.findByProdintnf", query = "SELECT i FROM Itemagro i WHERE i.prodintnf = :prodintnf"),
    @NamedQuery(name = "Itemagro.findByAcesalneg", query = "SELECT i FROM Itemagro i WHERE i.acesalneg = :acesalneg"),
    @NamedQuery(name = "Itemagro.findByItemcotaped", query = "SELECT i FROM Itemagro i WHERE i.itemcotaped = :itemcotaped"),
    @NamedQuery(name = "Itemagro.findByQtdecotaped", query = "SELECT i FROM Itemagro i WHERE i.qtdecotaped = :qtdecotaped"),
    @NamedQuery(name = "Itemagro.findByQtdesaicotaped", query = "SELECT i FROM Itemagro i WHERE i.qtdesaicotaped = :qtdesaicotaped"),
    @NamedQuery(name = "Itemagro.findByDtultatcota", query = "SELECT i FROM Itemagro i WHERE i.dtultatcota = :dtultatcota"),
    @NamedQuery(name = "Itemagro.findByUseridatcota", query = "SELECT i FROM Itemagro i WHERE i.useridatcota = :useridatcota"),
    @NamedQuery(name = "Itemagro.findByClassificacaoabc", query = "SELECT i FROM Itemagro i WHERE i.classificacaoabc = :classificacaoabc"),
    @NamedQuery(name = "Itemagro.findByEstoquemaximo", query = "SELECT i FROM Itemagro i WHERE i.estoquemaximo = :estoquemaximo"),
    @NamedQuery(name = "Itemagro.findByCodigoctbconf", query = "SELECT i FROM Itemagro i WHERE i.codigoctbconf = :codigoctbconf"),
    @NamedQuery(name = "Itemagro.findByIdaplictipo", query = "SELECT i FROM Itemagro i WHERE i.idaplictipo = :idaplictipo"),
    @NamedQuery(name = "Itemagro.findByTrrcdanpitem", query = "SELECT i FROM Itemagro i WHERE i.trrcdanpitem = :trrcdanpitem"),
    @NamedQuery(name = "Itemagro.findByTrrmassaesp", query = "SELECT i FROM Itemagro i WHERE i.trrmassaesp = :trrmassaesp"),
    @NamedQuery(name = "Itemagro.findByTrrembquilos", query = "SELECT i FROM Itemagro i WHERE i.trrembquilos = :trrembquilos"),
    @NamedQuery(name = "Itemagro.findByTipoitemsped", query = "SELECT i FROM Itemagro i WHERE i.tipoitemsped = :tipoitemsped"),
    @NamedQuery(name = "Itemagro.findByUltalt", query = "SELECT i FROM Itemagro i WHERE i.ultalt = :ultalt"),
    @NamedQuery(name = "Itemagro.findByTrrembqtd", query = "SELECT i FROM Itemagro i WHERE i.trrembqtd = :trrembqtd"),
    @NamedQuery(name = "Itemagro.findByExpdescitem", query = "SELECT i FROM Itemagro i WHERE i.expdescitem = :expdescitem"),
    @NamedQuery(name = "Itemagro.findByExpncm", query = "SELECT i FROM Itemagro i WHERE i.expncm = :expncm"),
    @NamedQuery(name = "Itemagro.findByExpre", query = "SELECT i FROM Itemagro i WHERE i.expre = :expre"),
    @NamedQuery(name = "Itemagro.findByCdgrupoorc", query = "SELECT i FROM Itemagro i WHERE i.cdgrupoorc = :cdgrupoorc"),
    @NamedQuery(name = "Itemagro.findByDensidade", query = "SELECT i FROM Itemagro i WHERE i.densidade = :densidade"),
    @NamedQuery(name = "Itemagro.findByIndppitemsped", query = "SELECT i FROM Itemagro i WHERE i.indppitemsped = :indppitemsped"),
    @NamedQuery(name = "Itemagro.findByCoconfvalsped", query = "SELECT i FROM Itemagro i WHERE i.coconfvalsped = :coconfvalsped"),
    @NamedQuery(name = "Itemagro.findByTiporeceita", query = "SELECT i FROM Itemagro i WHERE i.tiporeceita = :tiporeceita"),
    @NamedQuery(name = "Itemagro.findByLocalexecserv", query = "SELECT i FROM Itemagro i WHERE i.localexecserv = :localexecserv"),
    @NamedQuery(name = "Itemagro.findByPiscofinscomulativo", query = "SELECT i FROM Itemagro i WHERE i.piscofinscomulativo = :piscofinscomulativo"),
    @NamedQuery(name = "Itemagro.findByEmbclagro", query = "SELECT i FROM Itemagro i WHERE i.embclagro = :embclagro"),
    @NamedQuery(name = "Itemagro.findByUnmult", query = "SELECT i FROM Itemagro i WHERE i.unmult = :unmult"),
    @NamedQuery(name = "Itemagro.findByGerareceitcomp", query = "SELECT i FROM Itemagro i WHERE i.gerareceitcomp = :gerareceitcomp"),
    @NamedQuery(name = "Itemagro.findByBasecalcimpostosped", query = "SELECT i FROM Itemagro i WHERE i.basecalcimpostosped = :basecalcimpostosped"),
    @NamedQuery(name = "Itemagro.findByAliqcalcimpostosped", query = "SELECT i FROM Itemagro i WHERE i.aliqcalcimpostosped = :aliqcalcimpostosped"),
    @NamedQuery(name = "Itemagro.findByVlrcalcimpostosped", query = "SELECT i FROM Itemagro i WHERE i.vlrcalcimpostosped = :vlrcalcimpostosped"),
    @NamedQuery(name = "Itemagro.findByValorinformadocalcimp", query = "SELECT i FROM Itemagro i WHERE i.valorinformadocalcimp = :valorinformadocalcimp"),
    @NamedQuery(name = "Itemagro.findByListserv", query = "SELECT i FROM Itemagro i WHERE i.listserv = :listserv"),
    @NamedQuery(name = "Itemagro.findByNumdialoteval", query = "SELECT i FROM Itemagro i WHERE i.numdialoteval = :numdialoteval"),
    @NamedQuery(name = "Itemagro.findByPrazorep", query = "SELECT i FROM Itemagro i WHERE i.prazorep = :prazorep"),
    @NamedQuery(name = "Itemagro.findByParteciap", query = "SELECT i FROM Itemagro i WHERE i.parteciap = :parteciap"),
    @NamedQuery(name = "Itemagro.findByCultivar", query = "SELECT i FROM Itemagro i WHERE i.cultivar = :cultivar"),
    @NamedQuery(name = "Itemagro.findBySecategoria", query = "SELECT i FROM Itemagro i WHERE i.secategoria = :secategoria"),
    @NamedQuery(name = "Itemagro.findByDesprecpadrao", query = "SELECT i FROM Itemagro i WHERE i.desprecpadrao = :desprecpadrao"),
    @NamedQuery(name = "Itemagro.findByPeneira", query = "SELECT i FROM Itemagro i WHERE i.peneira = :peneira"),
    @NamedQuery(name = "Itemagro.findByEmbexp", query = "SELECT i FROM Itemagro i WHERE i.embexp = :embexp"),
    @NamedQuery(name = "Itemagro.findByPafsync", query = "SELECT i FROM Itemagro i WHERE i.pafsync = :pafsync"),
    @NamedQuery(name = "Itemagro.findByEmbtrib", query = "SELECT i FROM Itemagro i WHERE i.embtrib = :embtrib"),
    @NamedQuery(name = "Itemagro.findByDiasdescanso", query = "SELECT i FROM Itemagro i WHERE i.diasdescanso = :diasdescanso"),
    @NamedQuery(name = "Itemagro.findByTipomargem", query = "SELECT i FROM Itemagro i WHERE i.tipomargem = :tipomargem")})
public class Itemagro implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITEM")
    private Integer item;
    @Basic(optional = false)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "REFERENCIA")
    private String referencia;
    @Basic(optional = false)
    @Column(name = "GRUPO")
    private int grupo;
    @Basic(optional = false)
    @Column(name = "UNIDADE")
    private String unidade;
    @Basic(optional = false)
    @Column(name = "TRIBUTACAO")
    private int tributacao;
    @Column(name = "CLASFISCAL")
    private String clasfiscal;
    @Column(name = "PRODUZIDO")
    private String produzido;
    @Column(name = "IMPORTADO")
    private String importado;
    @Column(name = "SERVICO")
    private String servico;
    @Column(name = "NROCODBAR")
    private String nrocodbar;
    @Basic(optional = false)
    @Column(name = "ATIVO")
    private String ativo;
    @Basic(optional = false)
    @Column(name = "LOTECTRL")
    private String lotectrl;
    @Lob
    @Column(name = "INFORMACOES")
    private String informacoes;
    @Column(name = "PESOBRUTO")
    private Integer pesobruto;
    @Column(name = "PESOLIQUIDO")
    private Integer pesoliquido;
    @Column(name = "REGISTROMA")
    private String registroma;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DESCMAXIMO")
    private BigDecimal descmaximo;
    @Column(name = "ESTOQUEMINIMO")
    private BigDecimal estoqueminimo;
    @Column(name = "EMBFERT")
    private BigDecimal embfert;
    @Column(name = "EMBAGROTOXICO")
    private BigDecimal embagrotoxico;
    @Column(name = "EMBSEMENTE")
    private BigDecimal embsemente;
    @Column(name = "NUMEROCM")
    private Integer numerocm;
    @Column(name = "PERCOPERTERC")
    private BigDecimal percoperterc;
    @Column(name = "MULTIPLO")
    private BigDecimal multiplo;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "MARCA")
    private Integer marca;
    @Column(name = "EBALANCA")
    private String ebalanca;
    @Column(name = "CDTIPOLANCTO")
    private BigDecimal cdtipolancto;
    @Column(name = "DATACADASTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datacadastro;
    @Column(name = "CULTURAID")
    private BigDecimal culturaid;
    @Column(name = "KIT")
    private String kit;
    @Column(name = "PRODINTNF")
    private String prodintnf;
    @Column(name = "ACESALNEG")
    private String acesalneg;
    @Column(name = "ITEMCOTAPED")
    private String itemcotaped;
    @Column(name = "QTDECOTAPED")
    private BigDecimal qtdecotaped;
    @Column(name = "QTDESAICOTAPED")
    private BigDecimal qtdesaicotaped;
    @Column(name = "DTULTATCOTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtultatcota;
    @Column(name = "USERIDATCOTA")
    private String useridatcota;
    @Column(name = "CLASSIFICACAOABC")
    private String classificacaoabc;
    @Column(name = "ESTOQUEMAXIMO")
    private BigDecimal estoquemaximo;
    @Column(name = "CODIGOCTBCONF")
    private BigDecimal codigoctbconf;
    @Column(name = "IDAPLICTIPO")
    private BigInteger idaplictipo;
    @Column(name = "TRRCDANPITEM")
    private BigInteger trrcdanpitem;
    @Column(name = "TRRMASSAESP")
    private BigInteger trrmassaesp;
    @Column(name = "TRREMBQUILOS")
    private BigInteger trrembquilos;
    @Column(name = "TIPOITEMSPED")
    private String tipoitemsped;
    @Column(name = "ULTALT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultalt;
    @Column(name = "TRREMBQTD")
    private BigInteger trrembqtd;
    @Column(name = "EXPDESCITEM")
    private String expdescitem;
    @Column(name = "EXPNCM")
    private String expncm;
    @Column(name = "EXPRE")
    private String expre;
    @Column(name = "CDGRUPOORC")
    private BigInteger cdgrupoorc;
    @Column(name = "DENSIDADE")
    private Double densidade;
    @Column(name = "INDPPITEMSPED")
    private String indppitemsped;
    @Column(name = "COCONFVALSPED")
    private String coconfvalsped;
    @Column(name = "TIPORECEITA")
    private BigInteger tiporeceita;
    @Column(name = "LOCALEXECSERV")
    private BigInteger localexecserv;
    @Column(name = "PISCOFINSCOMULATIVO")
    private String piscofinscomulativo;
    @Column(name = "EMBCLAGRO")
    private BigInteger embclagro;
    @Column(name = "UNMULT")
    private String unmult;
    @Column(name = "GERARECEITCOMP")
    private String gerareceitcomp;
    @Column(name = "BASECALCIMPOSTOSPED")
    private BigDecimal basecalcimpostosped;
    @Column(name = "ALIQCALCIMPOSTOSPED")
    private BigDecimal aliqcalcimpostosped;
    @Column(name = "VLRCALCIMPOSTOSPED")
    private String vlrcalcimpostosped;
    @Column(name = "VALORINFORMADOCALCIMP")
    private BigDecimal valorinformadocalcimp;
    @Column(name = "LISTSERV")
    private BigDecimal listserv;
    @Column(name = "NUMDIALOTEVAL")
    private BigInteger numdialoteval;
    @Column(name = "PRAZOREP")
    private BigInteger prazorep;
    @Column(name = "PARTECIAP")
    private String parteciap;
    @Column(name = "CULTIVAR")
    private BigDecimal cultivar;
    @Column(name = "SECATEGORIA")
    private String secategoria;
    @Lob
    @Column(name = "FOTO")
    private byte[] foto;
    @Column(name = "DESPRECPADRAO")
    private BigDecimal desprecpadrao;
    @Column(name = "PENEIRA")
    private String peneira;
    @Column(name = "EMBEXP")
    private BigDecimal embexp;
    @Column(name = "PAFSYNC")
    private String pafsync;
    @Column(name = "EMBTRIB")
    private BigDecimal embtrib;
    @Column(name = "DIASDESCANSO")
    private BigDecimal diasdescanso;
    @Basic(optional = false)
    @Column(name = "TIPOMARGEM")
    private String tipomargem;

    public Itemagro() {
    }

    public Itemagro(Integer item) {
        this.item = item;
    }

    public Itemagro(Integer item, String descricao, int grupo, String unidade, int tributacao, String ativo, String lotectrl, String tipomargem) {
        this.item = item;
        this.descricao = descricao;
        this.grupo = grupo;
        this.unidade = unidade;
        this.tributacao = tributacao;
        this.ativo = ativo;
        this.lotectrl = lotectrl;
        this.tipomargem = tipomargem;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        Integer oldItem = this.item;
        this.item = item;
        changeSupport.firePropertyChange("item", oldItem, item);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        String oldReferencia = this.referencia;
        this.referencia = referencia;
        changeSupport.firePropertyChange("referencia", oldReferencia, referencia);
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        int oldGrupo = this.grupo;
        this.grupo = grupo;
        changeSupport.firePropertyChange("grupo", oldGrupo, grupo);
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        String oldUnidade = this.unidade;
        this.unidade = unidade;
        changeSupport.firePropertyChange("unidade", oldUnidade, unidade);
    }

    public int getTributacao() {
        return tributacao;
    }

    public void setTributacao(int tributacao) {
        int oldTributacao = this.tributacao;
        this.tributacao = tributacao;
        changeSupport.firePropertyChange("tributacao", oldTributacao, tributacao);
    }

    public String getClasfiscal() {
        return clasfiscal;
    }

    public void setClasfiscal(String clasfiscal) {
        String oldClasfiscal = this.clasfiscal;
        this.clasfiscal = clasfiscal;
        changeSupport.firePropertyChange("clasfiscal", oldClasfiscal, clasfiscal);
    }

    public String getProduzido() {
        return produzido;
    }

    public void setProduzido(String produzido) {
        String oldProduzido = this.produzido;
        this.produzido = produzido;
        changeSupport.firePropertyChange("produzido", oldProduzido, produzido);
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        String oldImportado = this.importado;
        this.importado = importado;
        changeSupport.firePropertyChange("importado", oldImportado, importado);
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        String oldServico = this.servico;
        this.servico = servico;
        changeSupport.firePropertyChange("servico", oldServico, servico);
    }

    public String getNrocodbar() {
        return nrocodbar;
    }

    public void setNrocodbar(String nrocodbar) {
        String oldNrocodbar = this.nrocodbar;
        this.nrocodbar = nrocodbar;
        changeSupport.firePropertyChange("nrocodbar", oldNrocodbar, nrocodbar);
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        String oldAtivo = this.ativo;
        this.ativo = ativo;
        changeSupport.firePropertyChange("ativo", oldAtivo, ativo);
    }

    public String getLotectrl() {
        return lotectrl;
    }

    public void setLotectrl(String lotectrl) {
        String oldLotectrl = this.lotectrl;
        this.lotectrl = lotectrl;
        changeSupport.firePropertyChange("lotectrl", oldLotectrl, lotectrl);
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        String oldInformacoes = this.informacoes;
        this.informacoes = informacoes;
        changeSupport.firePropertyChange("informacoes", oldInformacoes, informacoes);
    }

    public Integer getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(Integer pesobruto) {
        Integer oldPesobruto = this.pesobruto;
        this.pesobruto = pesobruto;
        changeSupport.firePropertyChange("pesobruto", oldPesobruto, pesobruto);
    }

    public Integer getPesoliquido() {
        return pesoliquido;
    }

    public void setPesoliquido(Integer pesoliquido) {
        Integer oldPesoliquido = this.pesoliquido;
        this.pesoliquido = pesoliquido;
        changeSupport.firePropertyChange("pesoliquido", oldPesoliquido, pesoliquido);
    }

    public String getRegistroma() {
        return registroma;
    }

    public void setRegistroma(String registroma) {
        String oldRegistroma = this.registroma;
        this.registroma = registroma;
        changeSupport.firePropertyChange("registroma", oldRegistroma, registroma);
    }

    public BigDecimal getDescmaximo() {
        return descmaximo;
    }

    public void setDescmaximo(BigDecimal descmaximo) {
        BigDecimal oldDescmaximo = this.descmaximo;
        this.descmaximo = descmaximo;
        changeSupport.firePropertyChange("descmaximo", oldDescmaximo, descmaximo);
    }

    public BigDecimal getEstoqueminimo() {
        return estoqueminimo;
    }

    public void setEstoqueminimo(BigDecimal estoqueminimo) {
        BigDecimal oldEstoqueminimo = this.estoqueminimo;
        this.estoqueminimo = estoqueminimo;
        changeSupport.firePropertyChange("estoqueminimo", oldEstoqueminimo, estoqueminimo);
    }

    public BigDecimal getEmbfert() {
        return embfert;
    }

    public void setEmbfert(BigDecimal embfert) {
        BigDecimal oldEmbfert = this.embfert;
        this.embfert = embfert;
        changeSupport.firePropertyChange("embfert", oldEmbfert, embfert);
    }

    public BigDecimal getEmbagrotoxico() {
        return embagrotoxico;
    }

    public void setEmbagrotoxico(BigDecimal embagrotoxico) {
        BigDecimal oldEmbagrotoxico = this.embagrotoxico;
        this.embagrotoxico = embagrotoxico;
        changeSupport.firePropertyChange("embagrotoxico", oldEmbagrotoxico, embagrotoxico);
    }

    public BigDecimal getEmbsemente() {
        return embsemente;
    }

    public void setEmbsemente(BigDecimal embsemente) {
        BigDecimal oldEmbsemente = this.embsemente;
        this.embsemente = embsemente;
        changeSupport.firePropertyChange("embsemente", oldEmbsemente, embsemente);
    }

    public Integer getNumerocm() {
        return numerocm;
    }

    public void setNumerocm(Integer numerocm) {
        Integer oldNumerocm = this.numerocm;
        this.numerocm = numerocm;
        changeSupport.firePropertyChange("numerocm", oldNumerocm, numerocm);
    }

    public BigDecimal getPercoperterc() {
        return percoperterc;
    }

    public void setPercoperterc(BigDecimal percoperterc) {
        BigDecimal oldPercoperterc = this.percoperterc;
        this.percoperterc = percoperterc;
        changeSupport.firePropertyChange("percoperterc", oldPercoperterc, percoperterc);
    }

    public BigDecimal getMultiplo() {
        return multiplo;
    }

    public void setMultiplo(BigDecimal multiplo) {
        BigDecimal oldMultiplo = this.multiplo;
        this.multiplo = multiplo;
        changeSupport.firePropertyChange("multiplo", oldMultiplo, multiplo);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        Integer oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getEbalanca() {
        return ebalanca;
    }

    public void setEbalanca(String ebalanca) {
        String oldEbalanca = this.ebalanca;
        this.ebalanca = ebalanca;
        changeSupport.firePropertyChange("ebalanca", oldEbalanca, ebalanca);
    }

    public BigDecimal getCdtipolancto() {
        return cdtipolancto;
    }

    public void setCdtipolancto(BigDecimal cdtipolancto) {
        BigDecimal oldCdtipolancto = this.cdtipolancto;
        this.cdtipolancto = cdtipolancto;
        changeSupport.firePropertyChange("cdtipolancto", oldCdtipolancto, cdtipolancto);
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        Date oldDatacadastro = this.datacadastro;
        this.datacadastro = datacadastro;
        changeSupport.firePropertyChange("datacadastro", oldDatacadastro, datacadastro);
    }

    public BigDecimal getCulturaid() {
        return culturaid;
    }

    public void setCulturaid(BigDecimal culturaid) {
        BigDecimal oldCulturaid = this.culturaid;
        this.culturaid = culturaid;
        changeSupport.firePropertyChange("culturaid", oldCulturaid, culturaid);
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        String oldKit = this.kit;
        this.kit = kit;
        changeSupport.firePropertyChange("kit", oldKit, kit);
    }

    public String getProdintnf() {
        return prodintnf;
    }

    public void setProdintnf(String prodintnf) {
        String oldProdintnf = this.prodintnf;
        this.prodintnf = prodintnf;
        changeSupport.firePropertyChange("prodintnf", oldProdintnf, prodintnf);
    }

    public String getAcesalneg() {
        return acesalneg;
    }

    public void setAcesalneg(String acesalneg) {
        String oldAcesalneg = this.acesalneg;
        this.acesalneg = acesalneg;
        changeSupport.firePropertyChange("acesalneg", oldAcesalneg, acesalneg);
    }

    public String getItemcotaped() {
        return itemcotaped;
    }

    public void setItemcotaped(String itemcotaped) {
        String oldItemcotaped = this.itemcotaped;
        this.itemcotaped = itemcotaped;
        changeSupport.firePropertyChange("itemcotaped", oldItemcotaped, itemcotaped);
    }

    public BigDecimal getQtdecotaped() {
        return qtdecotaped;
    }

    public void setQtdecotaped(BigDecimal qtdecotaped) {
        BigDecimal oldQtdecotaped = this.qtdecotaped;
        this.qtdecotaped = qtdecotaped;
        changeSupport.firePropertyChange("qtdecotaped", oldQtdecotaped, qtdecotaped);
    }

    public BigDecimal getQtdesaicotaped() {
        return qtdesaicotaped;
    }

    public void setQtdesaicotaped(BigDecimal qtdesaicotaped) {
        BigDecimal oldQtdesaicotaped = this.qtdesaicotaped;
        this.qtdesaicotaped = qtdesaicotaped;
        changeSupport.firePropertyChange("qtdesaicotaped", oldQtdesaicotaped, qtdesaicotaped);
    }

    public Date getDtultatcota() {
        return dtultatcota;
    }

    public void setDtultatcota(Date dtultatcota) {
        Date oldDtultatcota = this.dtultatcota;
        this.dtultatcota = dtultatcota;
        changeSupport.firePropertyChange("dtultatcota", oldDtultatcota, dtultatcota);
    }

    public String getUseridatcota() {
        return useridatcota;
    }

    public void setUseridatcota(String useridatcota) {
        String oldUseridatcota = this.useridatcota;
        this.useridatcota = useridatcota;
        changeSupport.firePropertyChange("useridatcota", oldUseridatcota, useridatcota);
    }

    public String getClassificacaoabc() {
        return classificacaoabc;
    }

    public void setClassificacaoabc(String classificacaoabc) {
        String oldClassificacaoabc = this.classificacaoabc;
        this.classificacaoabc = classificacaoabc;
        changeSupport.firePropertyChange("classificacaoabc", oldClassificacaoabc, classificacaoabc);
    }

    public BigDecimal getEstoquemaximo() {
        return estoquemaximo;
    }

    public void setEstoquemaximo(BigDecimal estoquemaximo) {
        BigDecimal oldEstoquemaximo = this.estoquemaximo;
        this.estoquemaximo = estoquemaximo;
        changeSupport.firePropertyChange("estoquemaximo", oldEstoquemaximo, estoquemaximo);
    }

    public BigDecimal getCodigoctbconf() {
        return codigoctbconf;
    }

    public void setCodigoctbconf(BigDecimal codigoctbconf) {
        BigDecimal oldCodigoctbconf = this.codigoctbconf;
        this.codigoctbconf = codigoctbconf;
        changeSupport.firePropertyChange("codigoctbconf", oldCodigoctbconf, codigoctbconf);
    }

    public BigInteger getIdaplictipo() {
        return idaplictipo;
    }

    public void setIdaplictipo(BigInteger idaplictipo) {
        BigInteger oldIdaplictipo = this.idaplictipo;
        this.idaplictipo = idaplictipo;
        changeSupport.firePropertyChange("idaplictipo", oldIdaplictipo, idaplictipo);
    }

    public BigInteger getTrrcdanpitem() {
        return trrcdanpitem;
    }

    public void setTrrcdanpitem(BigInteger trrcdanpitem) {
        BigInteger oldTrrcdanpitem = this.trrcdanpitem;
        this.trrcdanpitem = trrcdanpitem;
        changeSupport.firePropertyChange("trrcdanpitem", oldTrrcdanpitem, trrcdanpitem);
    }

    public BigInteger getTrrmassaesp() {
        return trrmassaesp;
    }

    public void setTrrmassaesp(BigInteger trrmassaesp) {
        BigInteger oldTrrmassaesp = this.trrmassaesp;
        this.trrmassaesp = trrmassaesp;
        changeSupport.firePropertyChange("trrmassaesp", oldTrrmassaesp, trrmassaesp);
    }

    public BigInteger getTrrembquilos() {
        return trrembquilos;
    }

    public void setTrrembquilos(BigInteger trrembquilos) {
        BigInteger oldTrrembquilos = this.trrembquilos;
        this.trrembquilos = trrembquilos;
        changeSupport.firePropertyChange("trrembquilos", oldTrrembquilos, trrembquilos);
    }

    public String getTipoitemsped() {
        return tipoitemsped;
    }

    public void setTipoitemsped(String tipoitemsped) {
        String oldTipoitemsped = this.tipoitemsped;
        this.tipoitemsped = tipoitemsped;
        changeSupport.firePropertyChange("tipoitemsped", oldTipoitemsped, tipoitemsped);
    }

    public Date getUltalt() {
        return ultalt;
    }

    public void setUltalt(Date ultalt) {
        Date oldUltalt = this.ultalt;
        this.ultalt = ultalt;
        changeSupport.firePropertyChange("ultalt", oldUltalt, ultalt);
    }

    public BigInteger getTrrembqtd() {
        return trrembqtd;
    }

    public void setTrrembqtd(BigInteger trrembqtd) {
        BigInteger oldTrrembqtd = this.trrembqtd;
        this.trrembqtd = trrembqtd;
        changeSupport.firePropertyChange("trrembqtd", oldTrrembqtd, trrembqtd);
    }

    public String getExpdescitem() {
        return expdescitem;
    }

    public void setExpdescitem(String expdescitem) {
        String oldExpdescitem = this.expdescitem;
        this.expdescitem = expdescitem;
        changeSupport.firePropertyChange("expdescitem", oldExpdescitem, expdescitem);
    }

    public String getExpncm() {
        return expncm;
    }

    public void setExpncm(String expncm) {
        String oldExpncm = this.expncm;
        this.expncm = expncm;
        changeSupport.firePropertyChange("expncm", oldExpncm, expncm);
    }

    public String getExpre() {
        return expre;
    }

    public void setExpre(String expre) {
        String oldExpre = this.expre;
        this.expre = expre;
        changeSupport.firePropertyChange("expre", oldExpre, expre);
    }

    public BigInteger getCdgrupoorc() {
        return cdgrupoorc;
    }

    public void setCdgrupoorc(BigInteger cdgrupoorc) {
        BigInteger oldCdgrupoorc = this.cdgrupoorc;
        this.cdgrupoorc = cdgrupoorc;
        changeSupport.firePropertyChange("cdgrupoorc", oldCdgrupoorc, cdgrupoorc);
    }

    public Double getDensidade() {
        return densidade;
    }

    public void setDensidade(Double densidade) {
        Double oldDensidade = this.densidade;
        this.densidade = densidade;
        changeSupport.firePropertyChange("densidade", oldDensidade, densidade);
    }

    public String getIndppitemsped() {
        return indppitemsped;
    }

    public void setIndppitemsped(String indppitemsped) {
        String oldIndppitemsped = this.indppitemsped;
        this.indppitemsped = indppitemsped;
        changeSupport.firePropertyChange("indppitemsped", oldIndppitemsped, indppitemsped);
    }

    public String getCoconfvalsped() {
        return coconfvalsped;
    }

    public void setCoconfvalsped(String coconfvalsped) {
        String oldCoconfvalsped = this.coconfvalsped;
        this.coconfvalsped = coconfvalsped;
        changeSupport.firePropertyChange("coconfvalsped", oldCoconfvalsped, coconfvalsped);
    }

    public BigInteger getTiporeceita() {
        return tiporeceita;
    }

    public void setTiporeceita(BigInteger tiporeceita) {
        BigInteger oldTiporeceita = this.tiporeceita;
        this.tiporeceita = tiporeceita;
        changeSupport.firePropertyChange("tiporeceita", oldTiporeceita, tiporeceita);
    }

    public BigInteger getLocalexecserv() {
        return localexecserv;
    }

    public void setLocalexecserv(BigInteger localexecserv) {
        BigInteger oldLocalexecserv = this.localexecserv;
        this.localexecserv = localexecserv;
        changeSupport.firePropertyChange("localexecserv", oldLocalexecserv, localexecserv);
    }

    public String getPiscofinscomulativo() {
        return piscofinscomulativo;
    }

    public void setPiscofinscomulativo(String piscofinscomulativo) {
        String oldPiscofinscomulativo = this.piscofinscomulativo;
        this.piscofinscomulativo = piscofinscomulativo;
        changeSupport.firePropertyChange("piscofinscomulativo", oldPiscofinscomulativo, piscofinscomulativo);
    }

    public BigInteger getEmbclagro() {
        return embclagro;
    }

    public void setEmbclagro(BigInteger embclagro) {
        BigInteger oldEmbclagro = this.embclagro;
        this.embclagro = embclagro;
        changeSupport.firePropertyChange("embclagro", oldEmbclagro, embclagro);
    }

    public String getUnmult() {
        return unmult;
    }

    public void setUnmult(String unmult) {
        String oldUnmult = this.unmult;
        this.unmult = unmult;
        changeSupport.firePropertyChange("unmult", oldUnmult, unmult);
    }

    public String getGerareceitcomp() {
        return gerareceitcomp;
    }

    public void setGerareceitcomp(String gerareceitcomp) {
        String oldGerareceitcomp = this.gerareceitcomp;
        this.gerareceitcomp = gerareceitcomp;
        changeSupport.firePropertyChange("gerareceitcomp", oldGerareceitcomp, gerareceitcomp);
    }

    public BigDecimal getBasecalcimpostosped() {
        return basecalcimpostosped;
    }

    public void setBasecalcimpostosped(BigDecimal basecalcimpostosped) {
        BigDecimal oldBasecalcimpostosped = this.basecalcimpostosped;
        this.basecalcimpostosped = basecalcimpostosped;
        changeSupport.firePropertyChange("basecalcimpostosped", oldBasecalcimpostosped, basecalcimpostosped);
    }

    public BigDecimal getAliqcalcimpostosped() {
        return aliqcalcimpostosped;
    }

    public void setAliqcalcimpostosped(BigDecimal aliqcalcimpostosped) {
        BigDecimal oldAliqcalcimpostosped = this.aliqcalcimpostosped;
        this.aliqcalcimpostosped = aliqcalcimpostosped;
        changeSupport.firePropertyChange("aliqcalcimpostosped", oldAliqcalcimpostosped, aliqcalcimpostosped);
    }

    public String getVlrcalcimpostosped() {
        return vlrcalcimpostosped;
    }

    public void setVlrcalcimpostosped(String vlrcalcimpostosped) {
        String oldVlrcalcimpostosped = this.vlrcalcimpostosped;
        this.vlrcalcimpostosped = vlrcalcimpostosped;
        changeSupport.firePropertyChange("vlrcalcimpostosped", oldVlrcalcimpostosped, vlrcalcimpostosped);
    }

    public BigDecimal getValorinformadocalcimp() {
        return valorinformadocalcimp;
    }

    public void setValorinformadocalcimp(BigDecimal valorinformadocalcimp) {
        BigDecimal oldValorinformadocalcimp = this.valorinformadocalcimp;
        this.valorinformadocalcimp = valorinformadocalcimp;
        changeSupport.firePropertyChange("valorinformadocalcimp", oldValorinformadocalcimp, valorinformadocalcimp);
    }

    public BigDecimal getListserv() {
        return listserv;
    }

    public void setListserv(BigDecimal listserv) {
        BigDecimal oldListserv = this.listserv;
        this.listserv = listserv;
        changeSupport.firePropertyChange("listserv", oldListserv, listserv);
    }

    public BigInteger getNumdialoteval() {
        return numdialoteval;
    }

    public void setNumdialoteval(BigInteger numdialoteval) {
        BigInteger oldNumdialoteval = this.numdialoteval;
        this.numdialoteval = numdialoteval;
        changeSupport.firePropertyChange("numdialoteval", oldNumdialoteval, numdialoteval);
    }

    public BigInteger getPrazorep() {
        return prazorep;
    }

    public void setPrazorep(BigInteger prazorep) {
        BigInteger oldPrazorep = this.prazorep;
        this.prazorep = prazorep;
        changeSupport.firePropertyChange("prazorep", oldPrazorep, prazorep);
    }

    public String getParteciap() {
        return parteciap;
    }

    public void setParteciap(String parteciap) {
        String oldParteciap = this.parteciap;
        this.parteciap = parteciap;
        changeSupport.firePropertyChange("parteciap", oldParteciap, parteciap);
    }

    public BigDecimal getCultivar() {
        return cultivar;
    }

    public void setCultivar(BigDecimal cultivar) {
        BigDecimal oldCultivar = this.cultivar;
        this.cultivar = cultivar;
        changeSupport.firePropertyChange("cultivar", oldCultivar, cultivar);
    }

    public String getSecategoria() {
        return secategoria;
    }

    public void setSecategoria(String secategoria) {
        String oldSecategoria = this.secategoria;
        this.secategoria = secategoria;
        changeSupport.firePropertyChange("secategoria", oldSecategoria, secategoria);
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        byte[] oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public BigDecimal getDesprecpadrao() {
        return desprecpadrao;
    }

    public void setDesprecpadrao(BigDecimal desprecpadrao) {
        BigDecimal oldDesprecpadrao = this.desprecpadrao;
        this.desprecpadrao = desprecpadrao;
        changeSupport.firePropertyChange("desprecpadrao", oldDesprecpadrao, desprecpadrao);
    }

    public String getPeneira() {
        return peneira;
    }

    public void setPeneira(String peneira) {
        String oldPeneira = this.peneira;
        this.peneira = peneira;
        changeSupport.firePropertyChange("peneira", oldPeneira, peneira);
    }

    public BigDecimal getEmbexp() {
        return embexp;
    }

    public void setEmbexp(BigDecimal embexp) {
        BigDecimal oldEmbexp = this.embexp;
        this.embexp = embexp;
        changeSupport.firePropertyChange("embexp", oldEmbexp, embexp);
    }

    public String getPafsync() {
        return pafsync;
    }

    public void setPafsync(String pafsync) {
        String oldPafsync = this.pafsync;
        this.pafsync = pafsync;
        changeSupport.firePropertyChange("pafsync", oldPafsync, pafsync);
    }

    public BigDecimal getEmbtrib() {
        return embtrib;
    }

    public void setEmbtrib(BigDecimal embtrib) {
        BigDecimal oldEmbtrib = this.embtrib;
        this.embtrib = embtrib;
        changeSupport.firePropertyChange("embtrib", oldEmbtrib, embtrib);
    }

    public BigDecimal getDiasdescanso() {
        return diasdescanso;
    }

    public void setDiasdescanso(BigDecimal diasdescanso) {
        BigDecimal oldDiasdescanso = this.diasdescanso;
        this.diasdescanso = diasdescanso;
        changeSupport.firePropertyChange("diasdescanso", oldDiasdescanso, diasdescanso);
    }

    public String getTipomargem() {
        return tipomargem;
    }

    public void setTipomargem(String tipomargem) {
        String oldTipomargem = this.tipomargem;
        this.tipomargem = tipomargem;
        changeSupport.firePropertyChange("tipomargem", oldTipomargem, tipomargem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (item != null ? item.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itemagro)) {
            return false;
        }
        Itemagro other = (Itemagro) object;
        if ((this.item == null && other.item != null) || (this.item != null && !this.item.equals(other.item))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "interfaces.Itemagro[ item=" + item + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
