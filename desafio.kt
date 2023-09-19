class Aluno(val nome: String, val telefone: String) {
    fun matricular(curso: Curso) {
        curso.adicionarAluno(this)
    }
}

class Curso(val nome: String, val nivel: String, val cargaHoraria: Int, val conteudoEducacional: List<String>) {
    private val alunosMatriculados = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
        println("Aluno ${aluno.nome} matriculado no curso $nome")
    }

    fun exibirDetalhes() {
        println("Nome do curso: $nome")
        println("Nível: $nivel")
        println("Carga horária: $cargaHoraria horas")
        println("Conteúdo educacional:")
        for (conteudo in conteudoEducacional) {
            println("- $conteudo")
        }
        println("Alunos matriculados:")
        for (aluno in alunosMatriculados) {
            println("- ${aluno.nome}")
        }
    }
}

fun main() {
    val conteudoCurso = listOf("Introdução à Programação", "Estruturas de Dados", "Algoritmos")
    val curso = Curso("Curso de Programação", "Iniciante", 30, conteudoCurso)

    val aluno1 = Aluno("Thiago", "(85)99999-9999")
    aluno1.matricular(curso)

    val aluno2 = Aluno("Laís", "(85)98765-4321")
    aluno2.matricular(curso)

    curso.exibirDetalhes()
}

