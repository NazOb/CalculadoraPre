package mx.edu.itesca.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btn_1:Button = findViewById(R.id.btn_1)
        val btn_2:Button = findViewById(R.id.btn_2)
        val btn_3:Button = findViewById(R.id.btn_3)
        val btn_4:Button = findViewById(R.id.btn_4)
        val btn_5:Button = findViewById(R.id.btn_5)
        val btn_6:Button = findViewById(R.id.btn_6)
        val btn_7:Button = findViewById(R.id.btn_7)
        val btn_8:Button = findViewById(R.id.btn_8)
        val btn_9:Button = findViewById(R.id.btn_9)
        val btn_0:Button = findViewById(R.id.btn_0)


        val btn_delete:Button = findViewById(R.id.btn_delete)
        val btn_result:Button =findViewById(R.id.btn_result)

        val btn_plus:Button = findViewById(R.id.btn_plus)
        val btn_minus:Button = findViewById(R.id.btn_minus)
        val btn_mult:Button = findViewById(R.id.btn_mult)
        val btn_div:Button = findViewById(R.id.btn_div)

        val tv_result:TextView = findViewById(R.id.tv_result)
        val tv_op:TextView = findViewById(R.id.tv_op)

        btn_delete.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = s.dropLast(1)
            tv_op.setText(s1)
        }

        btn_1.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (1).toString()

            tv_op.setText(s+s1)
        }

        btn_2.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (2).toString()

            tv_op.setText(s+s1)
        }
        btn_3.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (3).toString()

            tv_op.setText(s+s1)
        }
        btn_4.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (4).toString()

            tv_op.setText(s+s1)
        }
        btn_5.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (5).toString()

            tv_op.setText(s+s1)
        }
        btn_6.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (6).toString()

            tv_op.setText(s+s1)
        }
        btn_7.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (7).toString()

            tv_op.setText(s+s1)
        }
        btn_8.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (8).toString()

            tv_op.setText(s+s1)
        }
        btn_9.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (9).toString()

            tv_op.setText(s+s1)
        }
        btn_0.setOnClickListener {
            var s = tv_op.text.toString()
            var s1 = (0).toString()

            tv_op.setText(s+s1)
        }

        btn_plus.setOnClickListener {
            var ans = tv_result.text.toString()
            var s = ""
            if(!ans.isNullOrBlank())
                s = ans
            else
                s = tv_op.text.toString()

            var s1 = "+"

            tv_op.setText(s+s1)
        }

        btn_minus.setOnClickListener {
            var ans = tv_result.text.toString()
            var s = ""
            if(!ans.isNullOrBlank())
                s = ans
            else
                s = tv_op.text.toString()

            var s1 = "-"

            tv_op.setText(s+s1)
        }

        btn_mult.setOnClickListener {
            var ans = tv_result.text.toString()
            var s = ""
            if(!ans.isNullOrBlank())
                s = ans
            else
                s = tv_op.text.toString()

            var s1 = "*"

            tv_op.setText(s+s1)
        }

        btn_div.setOnClickListener {
            var ans = tv_result.text.toString()
            var s = ""
            if(!ans.isNullOrBlank())
                s = ans
            else
                s = tv_op.text.toString()

            var s1 = "/"

            tv_op.setText(s+s1)
        }

        btn_result.setOnClickListener {
            var op = tv_op.text.toString()

            var n1 = ""
            var n2 = ""
            var oper = ""
            var result = 0
            var foundOperator = false

            for (i in op.indices) {
                if (op[i].isDigit()) {
                    if (!foundOperator) {
                        n1 += op[i]
                    } else {
                        n2 += op[i]
                    }
                } else {
                    if (!foundOperator) { // Solo detecta el primer operador
                        oper = op[i].toString()
                        foundOperator = true
                    }
                }
            }

            // Verificamos que tengamos números válidos antes de convertirlos
            if (n1.isNotEmpty() && n2.isNotEmpty()) {
                val nu1 = n1.toInt()
                val nu2 = n2.toInt()

                when (oper) {
                    "+" -> result = nu1 + nu2
                    "-" -> result = nu1 - nu2
                    "*" -> result = nu1 * nu2
                    "/" -> result = if (nu2 != 0) nu1 / nu2 else 0 // Evita división por 0
                }

                tv_result.text = result.toString()
            } else {
                tv_result.text = "Error"
            }
//
//            for (i in op.indices)
//                if (op[i].isDigit()) {
//                    if (oper.length < 0)
//                        n1 = n1 + op[i]
//                    else
//                        n2 = n2 + op[i]
//                }else {
//                    oper = op[i].toString()
//                }

//            var nu1 = n1.toInt()
//            var nu2 = n2.toInt()

//            when(oper){
//                "+" -> result = nu1+nu2
//            }

//            if(oper=="+")
//                result = (n1.toInt()+n2.toInt()).toString()


//            tv_result.setText(result.toString())

        }

    }
}