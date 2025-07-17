package com.example.medicalslip.controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.medicalslip.model.Patient;
import com.example.medicalslip.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/addpatient")
    public String showAddPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "addpatient";
    }

    @PostMapping("/addpatient")
    public String addPatient(@ModelAttribute("patient") Patient patient) {
        patientService.savePatient(patient);
        return "redirect:/patientdetails";
    }

    @GetMapping("/patientdetails")
    public String showPatientDetails(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patientdetails";
    }
}
