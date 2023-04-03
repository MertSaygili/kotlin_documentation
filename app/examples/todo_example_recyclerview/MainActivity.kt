import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf<Todo>(
            Todo("Follow AndroidDevs", false),
            Todo("Follow AndroidDevs", true),
            Todo("Start to learn kotlin", true),
            Todo("I'm hungry", false),
            Todo("Eat dinner", false),

        )
        val adapter = TodoAdapter(todoList)
        rwTodos.adapter = adapter
        rwTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
            Toast.makeText(this, "New todo added!", Toast.LENGTH_SHORT).show()
        }

    }
}
