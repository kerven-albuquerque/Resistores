package ifpb.pdm.resistores

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.math.pow

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var spUnidade: Spinner
    private lateinit var spTabela: Spinner
    private lateinit var tvResultado: TextView
    private lateinit var etValor: EditText
    private lateinit var btCalcular: Button

    private val TABELAS = 1
    private val listaUnidades = arrayOf("Ω", "kΩ", "MΩ")
    private val listaTabelas = arrayOf("Valores comerciais", "Editar tabelas de resistores")

    private var unidade = 0.0
    private var valor = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.spUnidade = findViewById(R.id.spMainUnidade)
        this.spTabela = findViewById(R.id.spMainTabela)
        this.etValor = findViewById(R.id.etMainValor)
        this.tvResultado = findViewById(R.id.tvMainResultado)
        this.btCalcular = findViewById(R.id.btMainCalcular)

        val unidadesAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaUnidades)
        unidadesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        this.spUnidade.adapter = unidadesAdapter
        // this.spUnidade.onItemSelectedListener = this

        val tabelasAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaTabelas)
        tabelasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        this.spTabela.adapter = tabelasAdapter
        this.spTabela.onItemSelectedListener = this

        spTabela.posi
    }

    /*
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val spinner = parent as Spinner
        if (spinner.id == R.id.spMainTabela) {
            if (position == listaTabelas.size - 1) {
                val it = Intent(this, TabelasActivity::class.java)
                startActivityForResult(it, TABELAS)
            }
        } else {
            this.unidade = 10.0.pow(3*position)
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        this.unidade = 0.0
    }
    */

}
