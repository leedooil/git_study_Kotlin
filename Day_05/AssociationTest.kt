class Doctor(val name: String){
    fun patientList(p:Patient){
        println("Doctor: $name, Patient: ${p.name}")
    }
}

class Patient(val name: String){
    fun doctorList(d:Doctor){
        println("Patient: $name, Doctor: ${d.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Leedooil")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}