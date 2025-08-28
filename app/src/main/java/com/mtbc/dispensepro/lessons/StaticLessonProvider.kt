package com.mtbc.dispensepro.lessons

import com.mtbc.dispensepro.model.Lesson
import com.mtbc.dispensepro.model.MCQ

object StaticLessonProvider {

    fun getAllLessons(): List<Lesson> {
        val lessons = listOf(
            Lesson(
                id = 1,
                title = "Appropriateness Review",
                info = "Before any medication is dispensed, a pharmacist must assess its appropriateness for the patient. This lesson guides you in critically evaluating prescriptions, identifying potential issues, and building the clinical judgment essential for ensuring safe and effective therapy — right from the prescription level.",
                mcqs = listOf(

                    MCQ(
                        id = 1,
                        prescription = "Ibuprofen 400 mg TID\nDiclofenac 50 mg BID",
                        question = "What type of error is present in this prescription?",
                        options = listOf(
                            "Therapeutic Duplication",
                            "Drug-Drug Interaction",
                            "Inappropriate Drug Use (7Rs)",
                            "No error"
                        ),
                        correctAnswerIndex = 0
                    ),

                    MCQ(
                        id = 2,
                        prescription = "Cefixime 200 mg BID for UTI\nHistory: Severe rash with amoxicillin (1 year ago)",
                        question = "What type of error is present in this prescription?",
                        options = listOf(
                            "Therapeutic Duplication",
                            "Hypersensitivity Risk",
                            "Inappropriate Drug Use (7Rs)",
                            "No error"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 3,
                        prescription = "Tramadol 50 mg TID\nOrphenadrine 100 mg BID",
                        question = "What type of error is present in this prescription?",
                        options = listOf(
                            "Therapeutic Duplication",
                            "Drug-Drug Interaction",
                            "Inappropriate Drug Use (7Rs)",
                            "No error"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 4,
                        prescription = "Levodopa/Carbidopa 100/25 mg TID\nDiet: High protein intake (meat, dairy at every meal)",
                        question = "What type of error is present in this prescription?",
                        options = listOf(
                            "Inappropriate route",
                            "Drug-Food Interaction",
                            "Inappropriate Drug Use (7Rs)",
                            "No error"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 5,
                        prescription = "Linezolid 600 mg PO BID\nDiagnosis: Mild sore throat, likely viral\nDuration prescribed: 14 days",
                        question = "What type of error is present in this prescription?",
                        options = listOf(
                            "Therapeutic Duplication",
                            "Inappropriate Drug Use (7Rs)",
                            "Drug-Drug Interaction",
                            "No error"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 6,
                        prescription = "Amikacin 500 mg IV BID\nPatient: Neonate (3 weeks old), weight: 3.2 kg\nNo renal function data",
                        question = "What will you do?",
                        options = listOf(
                            "Dispense as written",
                            "Adjust dose per weight and renal function (by consulting physician)",
                            "Monitor for ototoxicity only",
                            "Switch to an oral formulation for convenience"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 7,
                        prescription = "Losartan 50 mg OD\nPatient: Pregnant (2nd trimester)",
                        question = "What type of error is present in this prescription?",
                        options = listOf(
                            "Therapeutic Duplication",
                            "Contraindication",
                            "Drug-Drug Interaction",
                            "No error"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 8,
                        prescription = "Paracetamol 500 mg PO Q6h PRN for pain",
                        question = "What type of error is present in this prescription?",
                        options = listOf(
                            "Inappropriate Dose", "Allergy", "Drug-Drug Interaction", "No error"
                        ),
                        correctAnswerIndex = 3
                    ),

                    MCQ(
                        id = 9,
                        prescription = "Clarithromycin + Simvastatin",
                        question = "What will you do?",
                        options = listOf(
                            "Dispense both medications as prescribed",
                            "Replace simvastatin with pravastatin (by consulting physician)",
                            "Increase simvastatin dose to enhance lipid control",
                            "Temporarily hold simvastatin during clarithromycin therapy"
                        ),
                        correctAnswerIndex = 3
                    ),

                    MCQ(
                        id = 10,
                        prescription = "Loratadine 10 mg OD\nCetirizine 10 mg OD",
                        question = "What will you do?",
                        options = listOf(
                            "Dispense both antihistamines",
                            "Stop one antihistamine (by consulting physician)",
                            "Add ranitidine",
                            "Advise the patient to avoid alcohol while taking these medications"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 11,
                        prescription = "Ciprofloxacin 500 mg PO QID",
                        question = "What will you do?",
                        options = listOf(
                            "Dispense as written",
                            "Adjust to BID (by consulting physician)",
                            "Switch to levofloxacin",
                            "Counsel patient to avoid dairy products and antacids during therapy"
                        ),
                        correctAnswerIndex = 1
                    ),

                    MCQ(
                        id = 12,
                        prescription = "Fluconazole 400 mg OD\nWarfarin 5 mg OD",
                        question = "What will you do?",
                        options = listOf(
                            "Dispense both",
                            "Inform physician to monitor INR (by consulting physician)",
                            "Increase warfarin dose",
                            "Counsel patient about signs of bleeding and advise immediate reporting"
                        ),
                        correctAnswerIndex = 1
                    )
                ),
                false
            ), Lesson(
                id = 2,
                title = "Auxiliary Labels",
                info = "Behind every label is a critical safety message. In this lesson, you'll explore how simple warnings can prevent serious harm. Learn how to recognize, apply, and interpret auxiliary labels that ensure patients use medications safely and effectively.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "Earlier in the shift, you dispensed Dobutamine to a patient in cardiac ICU. Now you receive a prescription for Dopamine Hydrochloride 400 mg/250 mL IV infusion for a different patient. What’s the most appropriate auxiliary label to prevent medication error during administration?",
                        prescription = "",
                        options = listOf(
                            "For intravenous infusion only",
                            "Not safe in renal impairment",
                            "LASA – Look-Alike, Sound-Alike medication",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 2,
                        question = "A 64-year-old female presents with a fungal skin infection and is prescribed Sodium Fusidate 2% (Fucidin®), to be used twice daily. No allergy is documented. According to standard pharmacy auxiliary labeling guidelines, which label should be affixed?",
                        prescription = "",
                        options = listOf(
                            "Store in the refrigerator",
                            "For external use only",
                            "Shake well before use",
                            "Avoid direct sunlight"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 3,
                        question = "A pediatric prescription arrives for Enterogermina® (Bacillus clausii spores) 5 mL vials. You are dispensing a box of 10. What’s the correct auxiliary label?",
                        prescription = "",
                        options = listOf(
                            "Must be diluted before use",
                            "Not for injection",
                            "Shake well before use",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 4,
                        question = "A prescription for Augmentin® 400 mg/57 mg per 5 mL is presented for a 3-year-old child. The powder has not been reconstituted yet. Which label should you include?",
                        prescription = "",
                        options = listOf(
                            "For oral use only",
                            "Not safe in pregnancy",
                            "Must be diluted before use",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 5,
                        question = "An inpatient’s prescription includes Warfarin 2.5 mg oral tablet. The patient has fluctuating INR values and is newly started. Which label is most appropriate?",
                        prescription = "",
                        options = listOf(
                            "High alert medication",
                            "Shake well before use",
                            "Store in refrigerator",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 6,
                        question = "A caregiver presents a prescription for Cefixime oral suspension 100 mg/5 mL for a child with UTI. You are dispensing a reconstituted bottle. Which label is essential?",
                        prescription = "",
                        options = listOf(
                            "Shake well before use",
                            "Do not chew",
                            "High alert",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 7,
                        question = "Insulin Glargine vial is being dispensed to a patient in a hot climate. Which label must be added?",
                        prescription = "",
                        options = listOf(
                            "Keep refrigerated, do not freeze",
                            "Shake well before use",
                            "High alert medication",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 8,
                        question = "A prescription states Metoprolol 50 mg once daily. The product supplied is an extended-release tablet. Which auxiliary label should you add?",
                        prescription = "",
                        options = listOf(
                            "Take with plenty of water",
                            "Don’t chew or crush",
                            "Take on an empty stomach",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 9,
                        question = "A prescription is received for Tiotropium 18 mcg Rotacaps. Patient is instructed to take 1 capsule daily. Which label is most important?",
                        prescription = "",
                        options = listOf(
                            "Not for oral use",
                            "High alert medication",
                            "Store in refrigerator",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 10,
                        question = "You receive a repeat order for Cisatracurium (Ciscuron®) from the anesthesia team. The intern looks unsure while collecting it. Which label MUST be applied?",
                        prescription = "",
                        options = listOf(
                            "Not for IV push",
                            "Warning: Paralyzing agent",
                            "Store away from light",
                            "No auxiliary label needed"
                        ),
                        correctAnswerIndex = 1
                    )
                ),
                true
            ), Lesson(
                id = 3,
                title = "High Alert Medications",
                info = "Some medications demand extra caution — even a small error can lead to serious harm. In this lesson, you'll learn how to identify high alert drugs, use labeling systems and apply double-check processes to ensure patient safety at every step.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "As a pharmacist reviewing an insulin infusion order in the ICU, why is insulin classified as a high-alert medication?",
                        prescription = "",
                        options = listOf(
                            "It requires cold chain maintenance during transport",
                            "Rapid onset can delay glucose control",
                            "Misuse, even in the form of small dosing errors, can result in severe hypoglycemia and neurological compromise.",
                            "It is only used in critically ill diabetic patients"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 2,
                        question = "While dispensing risperidone, you notice the order was mistakenly entered as ropinirole. What is the greatest patient safety concern associated with LASA (Look-Alike Sound-Alike) medications in this context?",
                        prescription = "",
                        options = listOf(
                            "Therapeutic duplication of CNS agents",
                            "Risk of allergic reactions due to wrong excipients",
                            "Inadvertent administration of an incorrect medication due to name similarity",
                            "High cost errors in formulary management"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 3,
                        question = "You are verifying a chemotherapy order for vincristine. What justifies its inclusion as a high-alert medication in the pharmacy formulary?",
                        prescription = "",
                        options = listOf(
                            "Requires pharmacy-prepared IV bag due to light sensitivity",
                            "Administration via the wrong route (e.g., intrathecal) can be fatal",
                            "It is restricted to oncology services only",
                            "It commonly causes infusion site reactions"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 4,
                        question = "Which intervention aligns best with the pharmacist's role in minimizing harm associated with dispensing high-alert medications?",
                        prescription = "",
                        options = listOf(
                            "Rechecking patient demographics at time of dispensing",
                            "Enforcing automated dispensing without verification",
                            "Implementing standardized protocols and independent double-checks during verification",
                            "Reducing overall use of injectable medications"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 5,
                        question = "Neuromuscular blockers (e.g., rocuronium) are dispensed to the OR. What key risk should the pharmacist always consider when handling these agents?",
                        prescription = "",
                        options = listOf(
                            "Their risk of histamine-related reactions",
                            "They require refrigerated storage",
                            "They can cause complete paralysis while the patient remains fully conscious if sedation is inadequate",
                            "They increase respiratory secretions"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 6,
                        question = "While stocking the narcotics cabinet, which storage policy should be strictly followed for high-alert medications?",
                        prescription = "",
                        options = listOf(
                            "Separate them from regular meds with a “HIGH ALERT” label in a restricted-access area",
                            "Store them alphabetically with similar-looking vials for convenience",
                            "Apply handwritten caution labels at the time of dispensing",
                            "Keep them with emergency crash medications for faster access"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 7,
                        question = "You receive a discharge prescription with both warfarin and apixaban. What is the pharmacist’s most appropriate next step?",
                        prescription = "",
                        options = listOf(
                            "Dispense as-is, as both are anticoagulants",
                            "Substitute one for aspirin after consulting the patient",
                            "Flag the duplication to the prescriber due to increased bleeding risk",
                            "Reduce the dose of both and approve the order"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 8,
                        question = "You are asked to verify a stat order containing ketamine, insulin, and atracurium. From a pharmacist’s standpoint, what makes this combination significant?",
                        prescription = "",
                        options = listOf(
                            "All are Schedule II controlled substances",
                            "All require refrigeration",
                            "All are listed high-alert medications under institutional protocols (BLACK NITE)",
                            "All are sedatives and can be interchanged"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 9,
                        question = "While preparing cyclophosphamide IV for a pediatric patient, which pharmacist-led verification step is essential?",
                        prescription = "",
                        options = listOf(
                            "Check weight, renal function, and prepare under biosafety hood using PPE",
                            "Ensure IV line patency and premedicate with dexamethasone",
                            "Reconstitute and transfer the drug into oral solution for easy administration",
                            "Verify that the patient is NPO and review platelet count only"
                        ),
                        correctAnswerIndex = 0
                    )
                ),
                true
            ), Lesson(
                id = 4,
                title = "Parts of a Prescription",
                info = "A prescription is more than just a list of medicines — it's a legal and clinical document. In this lesson, you'll learn to identify each essential component and determine whether a prescription is complete, valid, and ready for dispensing.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "What part of the prescription is missing?",
                        prescription = "Patient: __________________\n" + "Drug: Azithromycin 500 mg OD x 3 days\n" + "Directions: Take after meals\n" + "Prescriber: Dr. XYZ (Signed)\n" + "Date: 07-Aug-2025, Valid for 1 month",
                        options = listOf(
                            "Superscription", "Subscription", "Validity", "Prescription is complete"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 2,
                        question = "What part of the prescription is missing?",
                        prescription = "Patient: Me ABC, 45 yrs\n" + "Directions: Take once daily for 3 days\n" + "Prescriber: Dr. XYZ (Signed)\n" + "Date: 07-Aug-2025, Valid for 1 month",
                        options = listOf(
                            "Superscription", "Inscription", "Signature", "Prescription is complete"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 3,
                        question = "What part of the prescription is missing?",
                        prescription = "Patient: Miss ABC, 34 yrs, weight: 60 kg\n" + "Drug: Metronidazole 400 mg PO TID x 5 days\n" + "Prescriber: Dr. XYZ (Signed)\n" + "Date: 07-Aug-2025, Valid for 1 month",
                        options = listOf(
                            "Superscription",
                            "Subscription",
                            "Inscription",
                            "Prescription is complete"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 4,
                        question = "What part of the prescription is missing?",
                        prescription = "Patient: Mr ABC, 25 yrs\n" + "Drug: Paracetamol 500 mg PO QID PRN\n" + "Directions: Take in case of fever\n" + "Date: 07-Aug-2025, Valid for 1 month\n" + "Prescriber info is not mentioned.",
                        options = listOf(
                            "Signature",
                            "Subscription",
                            "Superscription",
                            "Prescription is complete"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 5,
                        question = "What part of the prescription is missing?",
                        prescription = "Patient: Miss Lu, 65 yrs\n" + "Drug: Clonazepam 0.5 mg OD x 14 days\n" + "Directions: Take at bedtime\n" + "Prescriber: Dr. XYZ (Signed)\n" + "Date: 01-Jan-2023",
                        options = listOf(
                            "Subscription", "Validity", "Superscription", "Prescription is complete"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 6,
                        question = "What part of the prescription is missing?",
                        prescription = "Patient: Mr ABC, 50 yrs, weight: 90kg\n" + "Drug: Amoxicillin/Clavulanate 625 mg TID x 7 days\n" + "Directions: Take with meals\n" + "Prescriber: Dr. XYZ (Signed)\n" + "Date: 01-Aug-2025, Valid for 7 days",
                        options = listOf(
                            "Superscription",
                            "Inscription",
                            "Subscription",
                            "Prescription is complete"
                        ),
                        correctAnswerIndex = 3
                    )
                ),
                true

            ), Lesson(
                id = 5,
                title = "Therapeutic Drug Monitoring (TDM)",
                info = "Some drugs require more than just dosing — they demand close monitoring to stay safe and effective. In this lesson, you'll explore the principles of TDM using medications, and learn how to interpret levels to guide clinical decisions.",
                mcqs = listOf(
                    MCQ(
                        id = 12,
                        question = "A 65-year-old male with a prosthetic heart valve is on warfarin. His last INR was 2.8, but his current INR is 1.2. The patient reports taking ciprofloxacin for a UTI. The pharmacist should recommend:",
                        options = listOf(
                            "Increasing the warfarin dose by 25% and rechecking the INR in one week.",
                            "Discontinuing warfarin and starting a direct oral anticoagulant (DOAC).",
                            "Increasing the warfarin dose by 50% and rechecking the INR tomorrow.",
                            "Discussing with the physician to decrease the warfarin dose and recheck the INR in 2-3 days after the antibiotic course is completed."
                        ),
                        correctAnswerIndex = 3 // Ciprofloxacin ↑ INR → must decrease warfarin, not increase
                    ), MCQ(
                        id = 13,
                        question = "A 32-year-old female patient on warfarin for a DVT is considering pregnancy. According to the hospital's policy, what is the most appropriate counseling point?",
                        options = listOf(
                            "Warfarin is safe during pregnancy, but a higher dose may be needed.",
                            "She must switch to low-molecular-weight heparin (LMWH) immediately upon conception.",
                            "Warfarin is contraindicated, and she must use two reliable forms of contraception while on therapy.",
                            "She should stop warfarin and discuss switching to an alternative anticoagulant with her doctor, as warfarin is a known teratogen."
                        ),
                        correctAnswerIndex = 3 // Warfarin is contraindicated → switch to safer alternative
                    ), MCQ(
                        id = 14,
                        question = "A pharmacist is reviewing a patient's chart who is on warfarin. The patient’s INR has been consistently stable at 2.5. The patient mentions he has started drinking green tea daily to improve his health. What is the most appropriate action?",
                        options = listOf(
                            "Advise the patient to stop drinking green tea, as it will increase the INR.",
                            "Inform the patient that green tea has no effect on warfarin therapy.",
                            "Recommend increasing the warfarin dose to counteract the effect of green tea.",
                            "Counsel the patient to maintain a uniform amount of green leafy vegetables and green tea consumption, as significant changes could alter the INR."
                        ),
                        correctAnswerIndex = 3 // Consistency is key
                    ), MCQ(
                        id = 15,
                        question = "A patient on warfarin with an INR of 3.2 is scheduled for dental surgery to have a tooth extracted. The physician asks the pharmacist for a recommendation. What is the most appropriate course of action based on the hospital's TDM form?",
                        options = listOf(
                            "Advise the physician that the INR is within range and no dose adjustment is necessary.",
                            "Recommend holding the warfarin dose for 24 hours before the procedure.",
                            "Recommend holding warfarin for 4-6 days prior to the procedure and obtaining a new INR before the surgery.",
                            "Suggest administering Vitamin K to reverse the effects of warfarin before the surgery."
                        ),
                        correctAnswerIndex = 2 // Hold warfarin 4–6 days before major dental surgery
                    ), MCQ(
                        id = 16,
                        question = "A patient on warfarin is hospitalized for community-acquired pneumonia and is started on a new antibiotic. The pharmacist notes the patient's current medications include trimethoprim/sulfamethoxazole. What is the most appropriate intervention?",
                        options = listOf(
                            "Monitor the patient's CBC daily for signs of bleeding.",
                            "Request a baseline INR and repeat it in 2 weeks.",
                            "Change the antibiotic to one that has no interaction with warfarin.",
                            "Inform the prescribing physician of the significant interaction and recommend a dose reduction of warfarin and closer INR monitoring."
                        ),
                        correctAnswerIndex = 3 // TMP/SMX major interaction → reduce dose & monitor
                    ), MCQ(
                        id = 17,
                        question = "A 70-year-old hemodialysis patient on Epoetin Alfa (Epokine) has a current hemoglobin (Hgb) of 9.2 g/dL. His previous Hgb, measured 4 weeks ago, was 8.5 g/dL. What is the most appropriate dose adjustment based on the hospital's ESA protocol?",
                        options = listOf(
                            "Decrease the ESA dose by 25%.",
                            "Hold the ESA dose for the next week.",
                            "No change is needed; continue monitoring Hgb monthly.",
                            "Increase the ESA dose by 25%."
                        ),
                        correctAnswerIndex = 2 // Rise <1 g/dL in 4 weeks → continue same dose
                    ), MCQ(
                        id = 18,
                        question = "A dialysis patient is prescribed Epokine 4000 IU three times weekly. The pharmacist reviews the chart and notes that the patient's hemoglobin has risen from 10.5 g/dL to 12.8 g/dL over the past 2 weeks. What is the most appropriate intervention?",
                        options = listOf(
                            "Increase the ESA dose by 25%.",
                            "No dose change is required, as the Hgb is within the target range.",
                            "Decrease the ESA dose by 25%.",
                            "Hold the ESA dose until the Hgb drops below 11 g/dL."
                        ),
                        correctAnswerIndex = 2 // Rapid rise → decrease dose by 25%
                    ), MCQ(
                        id = 19,
                        question = "A patient on ESA therapy has a current hemoglobin level of 13.5 g/dL. Based on the hospital's TDM form, what is the most appropriate action for the pharmacist to recommend?",
                        options = listOf(
                            "Increase the ESA dose by 25% to maintain the Hgb above 13 g/dL.",
                            "Hold the ESA therapy immediately, as the Hgb is at or above the upper limit of 13 g/dL.",
                            "Decrease the ESA dose by 25% and monitor Hgb weekly.",
                            "Administer a blood transfusion to maintain Hgb stability."
                        ),
                        correctAnswerIndex = 1 // Hold ESA if Hgb ≥13
                    ), MCQ(
                        id = 20,
                        question = "A pharmacist is reviewing an ESA TDM form for a dialysis patient. The form specifies that a CBC must be repeated monthly for dialysis patients. The pharmacist notes that the patient's last CBC was performed 6 weeks ago. What is the most appropriate intervention?",
                        options = listOf(
                            "No intervention is needed; a CBC every two months is sufficient.",
                            "Increase the ESA dose by 25% to ensure the patient responds to therapy.",
                            "Notify the prescribing physician and recommend repeating the CBC as per the hospital's monitoring protocol.",
                            "Hold the ESA dose until a new CBC is available."
                        ),
                        correctAnswerIndex = 2 // Must repeat CBC monthly
                    ), MCQ(
                        id = 21,
                        question = "A 60-year-old dialysis patient on Recormon 4000 IU twice weekly has a current hemoglobin (Hgb) of 9.5 g/dL. Four weeks ago, his Hgb was 8.8 g/dL. Based on the hospital's TDM form, what is the most appropriate new dose for this patient?",
                        options = listOf(
                            "3000 IU twice weekly",
                            "4000 IU twice weekly",
                            "6000 IU twice weekly",
                            "5000 IU twice weekly"
                        ),
                        correctAnswerIndex = 1 // Hgb rise <1 g/dL → continue same dose
                    )
                ),
                true
            ), Lesson(
                id = 6,
                title = "Check List While Dispensing",
                info = "Some medications carry higher risks — and require extra vigilance before reaching the patient. In this lesson, you’ll learn to apply critical safety checks while dispensing high-risk drugs, ensuring every step meets clinical and legal standards.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "A 45-year-old female patient with psoriasis is prescribed methotrexate 15 mg weekly. The pharmacist reviews her chart and notes that her latest creatinine clearance is 25 mL/min. What is the most appropriate action?",
                        options = listOf(
                            "Dispense the medication as prescribed, as the dose is appropriate.",
                            "Recommend increasing the dose, as the patient is not at the maximum weekly dose.",
                            "Flag the prescription and discuss with the physician due to the patient's compromised renal function.",
                            "Dispense a smaller quantity and recommend closer monitoring of lab reports."
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 2,
                        question = "A pharmacist is counseling a new patient on weekly methotrexate for rheumatoid arthritis. The patient also takes ibuprofen for pain. Which of the following is the most appropriate advice?",
                        options = listOf(
                            "Ibuprofen can be taken with methotrexate to enhance its anti-inflammatory effects.",
                            "Ibuprofen should be taken on a different day than the methotrexate dose to avoid an interaction.",
                            "Ibuprofen is contraindicated and should not be used for pain management.",
                            "Use paracetamol for pain relief instead of ibuprofen, or consult the physician if NSAID use is necessary."
                        ),
                        correctAnswerIndex = 3
                    ), MCQ(
                        id = 3,
                        question = "A patient calls the pharmacy and asks for guidance on taking her weekly methotrexate. She took her dose yesterday and wants to know when to take her folic acid. According to the dispensing checklist, what is the correct instruction?",
                        options = listOf(
                            "Take the folic acid at the same time as the methotrexate dose.",
                            "She should have taken the folic acid one day before the methotrexate dose.",
                            "Folic acid is not necessary if the patient is on a low dose of methotrexate.",
                            "Take the folic acid 24 hours after the methotrexate dose, not on the same day."
                        ),
                        correctAnswerIndex = 3
                    ), MCQ(
                        id = 4,
                        question = "A 75-year-old male with a history of non-valvular atrial fibrillation (NVAF) is prescribed rivaroxaban 20 mg once daily. The pharmacist reviews the chart and sees the patient's creatinine clearance is 45 mL/min. Which of the following is the most appropriate intervention?",
                        options = listOf(
                            "Contact the physician to increase the dose to 25 mg once daily.",
                            "Discuss with the physician the need to reduce the dose to 15 mg once daily.",
                            "Dispense the 20 mg dose, as no dose adjustment is required.",
                            "Recommend switching to apixaban, as it is safer in renal impairment."
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 5,
                        question = "A patient on apixaban for DVT treatment calls the pharmacy and reports a severe headache and nosebleeds that are difficult to stop. According to the dispensing checklist, what is the most appropriate advice?",
                        options = listOf(
                            "Continue the apixaban dose but monitor for any signs of gastrointestinal bleeding.",
                            "Tell the patient to use a soft toothbrush and avoid activities that may cause injury.",
                            "Advise the patient to stop the medication and seek immediate medical attention.",
                            "Counsel the patient to check their blood pressure, as the symptoms are unrelated to apixaban."
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 6,
                        question = "A pharmacist is conducting a dispensing check for a new prescription for apixaban. The patient is also taking carbamazepine. What is the pharmacist's most appropriate action?",
                        options = listOf(
                            "Advise the patient to take the carbamazepine at least two hours apart from the apixaban.",
                            "No intervention is necessary, as there is no significant interaction.",
                            "Flag the interaction with the physician, as this combination is generally not recommended.",
                            "Counsel the patient on the risk of increased apixaban levels and potential bleeding."
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 7,
                        question = "A patient on rivaroxaban for a TKR (Total Knee Replacement) is scheduled for a minor surgical procedure. According to the dispensing checklist, how should the pharmacist counsel the patient regarding their rivaroxaban dose?",
                        options = listOf(
                            "The patient should hold the rivaroxaban dose on the morning of the procedure only.",
                            "The patient should stop rivaroxaban 4-6 days before the procedure.",
                            "No dose hold is required for minor procedures.",
                            "The patient should stop rivaroxaban 22 hours prior to the procedure."
                        ),
                        correctAnswerIndex = 3
                    ), MCQ(
                        id = 8,
                        question = "A pharmacist receives a prescription for lithium carbonate for a new patient with bipolar disorder. The patient's creatinine clearance is 25 mL/min. What is the most appropriate action for the pharmacist?",
                        options = listOf(
                            "Dispense the full dose as prescribed, but recommend rechecking the creatinine clearance in 3 months.",
                            "Advise the patient to increase their fluid intake to compensate for the renal impairment.",
                            "Counsel the patient that a higher dose of lithium will be required to be effective.",
                            "Contact the physician, as the dose may need to be reduced by 50% due to the patient's renal function."
                        ),
                        correctAnswerIndex = 3
                    ), MCQ(
                        id = 9,
                        question = "A patient on lithium carbonate calls the pharmacy reporting signs of toxicity, including coarse tremors, nausea, and slurred speech. The pharmacist learns that the patient has recently started taking lisinopril. What is the most likely cause of the patient's symptoms?",
                        options = listOf(
                            "The patient likely forgot to take a dose of lithium.",
                            "Lisinopril is a diuretic, which will decrease lithium levels.",
                            "The patient's dehydration is causing a decrease in lithium levels.",
                            "The interaction between lisinopril and lithium is likely causing an increase in serum lithium levels."
                        ),
                        correctAnswerIndex = 3
                    ), MCQ(
                        id = 10,
                        question = "A patient is being counseled on the importance of hydration while taking lithium. The pharmacist should explain that dehydration can:",
                        options = listOf(
                            "Decrease the serum lithium level, leading to a loss of therapeutic effect.",
                            "Cause the patient to excrete lithium more rapidly, requiring a dose increase.",
                            "Increase the serum lithium level, which can lead to toxicity.",
                            "Not affect serum lithium levels, as long as the patient is eating a balanced diet."
                        ),
                        correctAnswerIndex = 2
                    )
                ),
                true
            ), Lesson(
                id = 7,
                title = "Renal Dose Adjustment",
                info = "Kidneys play a vital role in drug clearance — and impaired function demands careful dose modification. In this lesson, you'll learn how to adjust medications based on renal function using different tools, ensuring safe and effective therapy for patients with compromised kidney function.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "A 66-year-old male with diabetic foot ulcer and cellulitis (Serum Creatinine: 2.1 mg/dL) is prescribed Piperacillin-Tazobactam 4.5 g IV q6h. Considering the patient’s renal function, what is the most appropriate recommendation?",
                        prescription = "Piperacillin-Tazobactam 4.5 g IV q6h",
                        options = listOf(
                            "Continue Piperacillin-Tazobactam 4.5 g IV q6h without changes",
                            "Switch Piperacillin-Tazobactam to 4.5 g IV q12h",
                            "Adjust Piperacillin-Tazobactam to 3.375 g IV q6h or 4.5 g IV q8h",
                            "Discontinue Piperacillin-Tazobactam and use an alternative agent"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 2,
                        question = "A 58-year-old male with HAP (possibly pseudomonal) and diabetic nephropathy (Serum Creatinine: 2.9 mg/dL) is prescribed Meropenem 1 g IV q8h. What is the most appropriate intervention?",
                        prescription = "Meropenem 1 g IV q8h",
                        options = listOf(
                            "Continue Meropenem 1 g IV q8h",
                            "Reduce to Meropenem 500 mg IV q8h",
                            "Adjust to Meropenem 1 g IV q12h",
                            "Switch to Piperacillin-tazobactam 4.5 g IV q6h"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 3,
                        question = "A 58-year-old male with HAP and diabetic nephropathy (Serum Creatinine: 2.9 mg/dL) is continued on his home antidiabetic therapy (Metformin 500 mg PO BID + Dapagliflozin). What is the most appropriate action regarding Metformin?",
                        prescription = "Metformin 500 mg PO BID, Dapagliflozin",
                        options = listOf(
                            "Continue Metformin as prescribed",
                            "Reduce Metformin to once daily",
                            "Discontinue Metformin",
                            "Substitute with Sitagliptin 100 mg daily"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 4,
                        question = "A 45-year-old female with SSTI suspicious for MRSA (Serum Creatinine: 2.0 mg/dL) is on Cefazolin 1 g IV q8h. Considering her renal function, what adjustment is needed?",
                        prescription = "Cefazolin 1 g IV q8h",
                        options = listOf(
                            "Continue Cefazolin 1 g IV q8h as prescribed",
                            "Increase Cefazolin to 2 g IV q8h",
                            "Extend Cefazolin dosing interval to 1 g IV q12h",
                            "Discontinue Cefazolin due to renal impairment"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 5,
                        question = "A 76-year-old female (70 kg, Serum Creatinine: 2.4 mg/dL) with complicated UTI (MDR Enterobacteriaceae) is on Colistin (Polymyxin E) 700,000 IU IV q12h. What is the most appropriate adjustment?",
                        prescription = "Colistin 700,000 IU IV q12h",
                        options = listOf(
                            "Continue current dose: 700,000 IU IV every 12 hours (≈ 46 mg CBA/day)",
                            "Reduce to 1.5 million IU IV once daily (≈ 50 mg CBA/day) to avoid nephrotoxicity",
                            "Adjust to ~160 mg CBA/day (≈ 4.8 million IU IV once daily)",
                            "Switch Colistin to 2 million IU IV q8h (≈ 200 mg CBA/day) for aggressive MDR coverage"
                        ),
                        correctAnswerIndex = 1
                    )
                ),
                true
            ), Lesson(
                id = 8,
                title = "Hepatic Dose Adjustment",
                info = "When the liver is compromised, drug metabolism changes — and so must the dose. In this lesson, you'll learn how to assess liver function and adjust medication dosing accordingly to avoid toxicity and ensure therapeutic effectiveness.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "Mr. Ahmed, a 58-year-old male with hemochromatosis-related advanced liver disease (Child-Pugh C), is on Deferasirox 40 mg/kg PO daily. Should deferasirox be continued at the same dose?",
                        prescription = "Deferasirox 40 mg/kg PO daily",
                        options = listOf(
                            "Continue at 40 mg/kg/day with ferritin and LFT monitoring",
                            "Reduce to 20 mg/kg/day due to impaired hepatic metabolism",
                            "Avoid use in severe hepatic impairment.",
                            "Consider switching to deferiprone or deferoxamine if chelation still required"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 2,
                        question = "Mr. Ahmed with decompensated cirrhosis is receiving Paracetamol 1 g PO QID (4 g/day). Is this dose safe?",
                        prescription = "Paracetamol 1 g PO QID (4 g/day)",
                        options = listOf(
                            "4 g/day is acceptable with normal renal function and short duration",
                            "2 g/day maximum due to risk of hepatotoxicity in cirrhosis",
                            "Up to 3 g/day may be acceptable if no alcohol use and duration <7 days",
                            "Paracetamol should generally be avoided; NSAIDs are safer for pain control"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 3,
                        question = "Mr. Ahmed with Child-Pugh C cirrhosis is on Sertraline 100 mg PO BID. Does sertraline require dose adjustment?",
                        prescription = "Sertraline 100 mg PO BID",
                        options = listOf(
                            "Continue at current dose; only minimal hepatic metabolism occurs",
                            "No adjustment needed unless dose exceeds 150–200 mg/day",
                            "Use not recommended; if continued, reduce by 50% with close monitoring",
                            "Consider switching to fluoxetine or mirtazapine as alternatives in cirrhosis"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 4,
                        question = "Mr. Ahmed has advanced liver disease with INR 2.1 and is on Enoxaparin 60 mg SC BID for prophylaxis. Is enoxaparin safe and effective in this setting?",
                        prescription = "Enoxaparin 60 mg SC BID",
                        options = listOf(
                            "Contraindicated in all patients with elevated INR or thrombocytopenia",
                            "Standard prophylactic dosing may be used cautiously, as INR is not reliable for bleeding risk",
                            "Dose escalation is often required to overcome 'pseudo-coagulopathy' of cirrhosis",
                            "Warfarin or DOACs are preferred over LMWH due to easier monitoring"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 5,
                        question = "Mr. Ahmed with Child-Pugh C cirrhosis is on Metoprolol 100 mg PO TID. Should the dose be modified due to impaired hepatic metabolism?",
                        prescription = "Metoprolol 100 mg PO TID",
                        options = listOf(
                            "No adjustment required; clearance is unchanged in cirrhosis",
                            "Avoid all non-selective beta-blockers in decompensated cirrhosis",
                            "Initiate at a lower dose with gradual titration due to reduced hepatic clearance",
                            "Prefer atenolol or bisoprolol as they undergo renal elimination and less hepatic metabolism"
                        ),
                        correctAnswerIndex = 2
                    )
                ),
                true

            ), Lesson(
                id = 9,
                title = "Pediatric Dose Adjustment",
                info = "Children aren't just small adults — their dosing requires precision. In this lesson, you’ll learn how to calculate appropriate pediatric doses using different tools, and adjust therapy based on age, weight, and organ function to ensure safe, effective treatment.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = """
            Patient Information:
            8-year-old male
            Weight: 25 kg
            Serum Creatinine: 1.2 mg/dL
            Diagnosis: Complicated UTI (E. coli)
            Prescription: Gentamicin 2.5 mg/kg IV q8h
            
            A pharmacist reviews this case. Considering pediatric dosing recommendations, what is the most appropriate adjustment?
        """.trimIndent(),
                        options = listOf(
                            "Continue Gentamicin 2.5 mg/kg IV q8h and monitor peaks only",
                            "Extend interval to Gentamicin 2.5 mg/kg IV q12h to reduce nephrotoxicity",
                            "**Switch to extended-interval dosing: 7 mg/kg IV q24h with trough monitoring**",
                            "Reduce dose to 1 mg/kg IV q8h to minimize accumulation"
                        ),
                        correctAnswerIndex = 2
                    ),
            MCQ(
                id = 2,
                question = """
            Patient Information:
            10-year-old female, 32 kg
            Serum Creatinine: 0.9 mg/dL (normal)
            Diagnosis: Bacterial meningitis (suspected MRSA)
            Prescription: Vancomycin 15 mg/kg IV q6h
            
            What is the most appropriate action regarding Vancomycin dosing in this patient?
        """.trimIndent(),
                options = listOf(
                    "**Continue Vancomycin 15 mg/kg IV q6h with serum trough/AUC monitoring**",
                    "Extend to Vancomycin 15 mg/kg IV q12h to prevent nephrotoxicity",
                    "Increase to Vancomycin 20 mg/kg IV q6h for meningitis coverage",
                    "Switch to Linezolid 10 mg/kg IV q8h as it has better CNS penetration"
                ),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 3,
                question = """
            Patient Information:
            6-year-old male, 20 kg
            Serum Creatinine: 1.5 mg/dL
            Diagnosis: Partial (focal) seizures
            Prescription: Levetiracetam 20 mg/kg PO q12h (≈400 mg BID)
            
            Based on pediatric dosing, what is the best recommendation?
        """.trimIndent(),
                options = listOf(
                    "**Continue Levetiracetam 20 mg/kg PO q12h (within safe dosing range)**",
                    "Reduce to 10 mg/kg PO q12h due to slightly elevated creatinine",
                    "Increase immediately to 30 mg/kg PO q12h to reach target more quickly",
                    "Switch to Valproate 20 mg/kg/day as first-line therapy for focal seizures"
                ),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 4,
                question = """
            Patient Information:
            12-year-old female, 40 kg
            Serum Creatinine: 1.4 mg/dL (reduced renal function)
            Diagnosis: HIV, on ART
            Prescription: Lamivudine 150 mg PO BID
            
            What is the most appropriate adjustment for Lamivudine?
        """.trimIndent(),
                options = listOf(
                    "Continue 150 mg PO BID since weight is >25 kg",
                    "**Reduce to 150 mg PO once daily due to renal impairment**",
                    "Reduce to 75 mg PO BID to minimize toxicity",
                    "Switch to Zidovudine 300 mg PO BID as an alternative"
                ),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 5,
                question = """
            Patient Information:
            4-year-old male, 16 kg
            Serum Creatinine: 1.0 mg/dL (suggests renal impairment)
            Diagnosis: Candida infection
            Prescription: Fluconazole 6 mg/kg PO once daily
            
            Considering renal function, what is the most appropriate adjustment?
        """.trimIndent(),
                options = listOf(
                    "Continue Fluconazole 6 mg/kg once daily and monitor LFTs only",
                    "**Reduce to Fluconazole 6 mg/kg every 48 hours (50% adjustment for CrCl ≤50 mL/min)**",
                    "Reduce to Fluconazole 3 mg/kg once daily to minimize nephrotoxicity",
                    "Switch to Itraconazole 5 mg/kg/day since it avoids renal clearance"
                ),
                correctAnswerIndex = 1
            )
        )
        ,
                true
            ), Lesson(
                id = 10,
                title = "Chemo Dose Adjustment",
                info = "Precision is everything in chemotherapy — too little risks failure, too much causes harm. In this lesson, you'll learn how to adjust chemo doses based on body surface area and clinical parameters, ensuring optimal safety and efficacy for each patient.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "Patient: 60 kg, 170 cm. Regimen: Doxorubicin 50 mg/m² IV Day 1. What is the correct dose?",
                        prescription = "Doxorubicin 50 mg/m² IV Day 1",
                        options = listOf("82.5 mg", "84 mg", "90 mg", "100 mg"),
                        correctAnswerIndex = 1
                    ),
            MCQ(
                id = 2,
                question = "Same patient (60 kg, 170 cm). Regimen: Cyclophosphamide 750 mg/m² IV Day 1. What dose should be dispensed?",
                prescription = "Cyclophosphamide 750 mg/m² IV Day 1",
                options = listOf("1,200 mg", "1,250 mg", "1,260 mg", "1,300 mg"),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 3,
                question = "Order: Vincristine 2 mg/m² IV Day 1; Patient BSA = 1.50 m². What dose should be administered?",
                prescription = "Vincristine 2 mg/m² IV Day 1",
                options = listOf("3.0 mg", "2.5 mg", "2.0 mg", "1.5 mg"),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 4,
                question = "Regimen: Oxaliplatin 130 mg/m² Day 1. Prescribed: 283.4 mg. What is the implied BSA?",
                prescription = "Oxaliplatin 130 mg/m² Day 1, Prescribed: 283.4 mg",
                options = listOf("1.73 m²", "1.95 m²", "2.18 m²", "2.30 m²"),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 5,
                question = "XELOX: Capecitabine 1,000 mg/m² BID on Days 1–14. Use BSA = 2.18 m². What is the per-dose amount you would dispense?",
                prescription = "Capecitabine 1,000 mg/m² BID, BSA = 2.18 m²",
                options = listOf(
                    "2,300 mg (3×500 + 2×150)",
                    "2,250 mg (3×500 + 5×150)",
                    "2,000 mg (4×500)",
                    "2,150 mg (3×500 + 1×150)"
                ),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 6,
                question = "Regimen: Paclitaxel 175 mg/m² Day 1. Prescribed: 240 mg. What is the implied BSA?",
                prescription = "Paclitaxel 175 mg/m² Day 1, Prescribed: 240 mg",
                options = listOf("1.20 m²", "1.50 m²", "1.37 m²", "1.42 m²"),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 7,
                question = "Order: Cytarabine 3 g/m² IV over 4 h (single dose). Patient BSA = 1.20 m². What single infusion dose is correct?",
                prescription = "Cytarabine 3 g/m² IV over 4 h, BSA = 1.20 m²",
                options = listOf("2,400 mg", "3,600 mg", "3,000 mg", "4,200 mg"),
                correctAnswerIndex = 1
            )
        )
        ,
                true
            ), Lesson(
                id = 11,
                title = "Vancomycin Dose Adjustment",
                info = "Vancomycin requires careful monitoring to balance efficacy and toxicity. In this lesson, you’ll learn how to adjust dosing based on levels and kinetics using different tools.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "A 65-year-old male (80 kg, CrCl 70 mL/min) with MRSA pneumonia is receiving vancomycin 1 g IV q12h. Measured trough = 8 mg/L. What is the most appropriate adjustment?",
                        prescription = "Vancomycin 1 g IV q12h",
                        options = listOf(
                            "Continue 1 g IV q12h — trough 8 mg/L is sufficient for pneumonia",
                            "Increase to 1.5 g IV q12h — predicted trough ≈ 11 mg/L, AUC ≈ 493 mg·h/L.",
                            "Increase to 1.5 g IV q8h — predicted trough ≈ 24 mg/L, AUC ≈ 702 mg·h/L",
                            "Switch to linezolid due to 'subtherapeutic' trough despite acceptable AUC"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 2,
                        question = "A 72-year-old female (60 kg, CrCl 40 mL/min) is being treated for MRSA bacteremia. She is on vancomycin 1 g IV q12h. Measured trough = 24 mg/L. What is the most appropriate action?",
                        prescription = "Vancomycin 1 g IV q12h",
                        options = listOf(
                            "Continue 1 g IV q12h — trough within therapeutic range for bacteremia",
                            "Reduce to 750 mg IV q12h — predicted trough ≈ 17 mg/L, AUC ≈ 520 mg·h/L",
                            "Reduce to 1 g IV q24h — predicted trough ≈ 12 mg/L, AUC ≈ 320 mg·h/L",
                            "Switch to daptomycin immediately due to nephrotoxicity risk"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 3,
                        question = "A 55-year-old male (100 kg, CrCl 90 mL/min) with MRSA osteomyelitis is on vancomycin 1 g IV q12h. Measured trough = 13 mg/L (goal 15–20 mg/L). What is the best adjustment?",
                        prescription = "Vancomycin 1 g IV q12h",
                        options = listOf(
                            "Continue 1 g IV q12h — trough 13 mg/L acceptable for bone",
                            "Increase to 1.25 g IV q12h — predicted trough ≈ 16 mg/L, AUC ≈ 471 mg·h/L",
                            "Change to 1.5 g IV q24h — predicted trough ≈ 12 mg/L, AUC ≈ 536 mg·h/L",
                            "Increase to 1.5 g IV q12h — predicted trough ≈ 21 mg/L, AUC ≈ 642 mg·h/L"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 4,
                        question = "A 68-year-old male (70 kg, 172 cm, SCr 1.4 mg/dL, CrCl ≈55 mL/min) with MRSA pneumonia requires initial vancomycin; which regimen best achieves target AUC 400–600 mg·h/L and trough 15–20 mg/L?",
                        prescription = "Vancomycin (initial dosing for pneumonia)",
                        options = listOf(
                            "1 g IV q12h — trough ≈ 18 mg/L, AUC ≈ 585 mg·h/L",
                            "500 mg IV q12h — trough ≈ 12 mg/L, AUC ≈ 402 mg·h/L",
                            "750 mg IV q12h — trough ≈ 16 mg/L, AUC ≈ 491 mg·h/L",
                            "1.25 g IV q24h — trough ≈ 12 mg/L, AUC ≈ 321 mg·h/L"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 5,
                        question = "A 55-year-old female (60 kg, 160 cm, SCr 2.0 mg/dL, CrCl ≈30 mL/min) with MRSA osteomyelitis requires vancomycin. Which regimen is most appropriate?",
                        prescription = "Vancomycin (initial dosing for osteomyelitis)",
                        options = listOf(
                            "1 g IV q12h — trough ≈ 26 mg/L, AUC ≈ 710 mg·h/L",
                            "750 mg IV q24h — trough ≈ 12.9 mg/L, AUC ≈ 470 mg·h/L",
                            "500 mg IV q12h — trough ≈ 21 mg/L, AUC ≈ 650 mg·h/L",
                            "1.5 g IV q24h — trough ≈ 31 mg/L, AUC ≈ 810 mg·h/L"
                        ),
                        correctAnswerIndex = 1
                    )
                ),
                true
            ), Lesson(
                id = 12,
                title = "Compounding Calculations",
                info = "Precision is key when preparing personalized medications. This lesson guides you through essential compounding calculations, ensuring accuracy, safety, and compliance in every preparation.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "A physician prescribes Potassium phosphate oral solution 1 g/5 mL, total 50 mL. The available raw ingredient is potassium phosphate (monobasic) powder. How much powder is required to prepare the solution?",
                        options = listOf("5 g", "7 g", "**10 g**", "12.5 g"),
                        correctAnswerIndex = 2
                    ),
            MCQ(
                id = 2,
                question = "A pharmacist receives a prescription for Captopril oral solution 1 mg/mL, total 600 mL. The available tablets are 50 mg each. How many tablets are required to compound the solution?",
                options = listOf("6 tablets", "8 tablets", "12 tablets", "**24 tablets**"),
                correctAnswerIndex = 3
            ),
            MCQ(
                id = 3,
                question = "A physician prescribes Potassium citrate oral solution 10 mEq/5 mL, total 75 mL. Potassium citrate provides 1 mEq = 1.08 g. How many grams of potassium citrate are required to prepare this solution?",
                options = listOf("36.0 g", "**162.0 g**", "48.4 g", "454.0 g"),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 4,
                question = "A prescription requires Dexamethasone oral solution 1 mg/mL, total 16 mL. The available stock is Decadron injection 4 mg/mL. How many mL of Decadron are required?",
                options = listOf("2 mL", "4 mL", "**8 mL**", "16 mL"),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 5,
                question = "A physician prescribes Dexamethasone oral solution 1 mg/mL, 3 mg PO q12h for 7 days. The available stock is Decadron injection 4 mg/mL. The pharmacist decides to round to convenient volumes during compounding. Which of the following is the most appropriate preparation?",
                options = listOf(
                    "10 mL Decadron + 32 mL D25% → 42 mL final",
                    "10.5 mL Decadron + 31.5 mL D25% → 42 mL final",
                    "**11 mL Decadron + 33 mL D25% → 44 mL final**",
                    "12 mL Decadron + 30 mL D25% → 42 mL final"
                ),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 6,
                question = "A physician prescribes Sodium benzoate oral solution, 360 mg PO q12h for 5 days. The pharmacist decides to prepare a 100 mg/mL syrup. How many grams of sodium benzoate are required for a 40 mL preparation?",
                options = listOf("2 g", "3.6 g", "**4 g**", "5 g"),
                correctAnswerIndex = 2
            )
        )
        ,
                true
            ), Lesson(
                id = 13,
                title = "Crash Cart",
                info = "In emergencies, every second counts. Learn how to manage crash cart medications, maintain inventory, and ensure readiness for life-saving interventions at any moment.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 14,
                title = "Narcotics and Their Dispensing",
                info = "Handling controlled substances requires strict compliance. This lesson covers prescribing rules, dispensing limits, and documentation practices and controlled day supply regulations.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 15,
                title = "Emergency Room (ER): Antidote Protocols",
                info = "Antidotes can mean the difference between life and death. Explore emergency medicine protocols and antidote guidelines to respond quickly and accurately in critical situations.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 16,
                title = "Counseling",
                info = "Effective communication improves outcomes. This lesson teaches how to counsel patients during dispensing and discharge, with hands-on scenarios and more.",
                listOf(
                    MCQ(
                        id = 1,
                        question = "You are verifying a vancomycin order for a 78-year-old inpatient with CKD (CrCl ~25 mL/min). The prescriber ordered 1 g IV every 12 hours. The nurse insists, “They said it’s urgent — the doctor wants it right away.” What is your BEST immediate action as the pharmacist?",
                        prescription = "Vancomycin 1 g IV q12h, 78-year-old, CKD (CrCl 25 mL/min)",
                        options = listOf(
                            "Send the dose now to avoid delaying therapy — renal adjustment can be made later",
                            "Reduce the frequency yourself to every 24 hours and dispense",
                            "Hold dispensing until you confirm the dosing with the prescriber",
                            "Dispense as written but flag for pharmacy review on the next shift"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 2,
                        question = "You are counseling a patient being discharged on methotrexate 10 mg once weekly for rheumatoid arthritis. On the discharge sheet, the printed directions read “Take one tablet daily”. The patient says, “The doctor just said to take it for my joints, I didn’t catch how often.” What is your IMMEDIATE next step?",
                        prescription = "Methotrexate 10 mg once weekly; instructions printed: 'daily'",
                        options = listOf(
                            "Dispense as written and clarify dosing at the follow-up clinic",
                            "Correct the instructions to weekly and hand it over",
                            "Stop the process and urgently clarify with the prescriber before dispensing",
                            "Give the medicine with a large 'Weekly Dose Only' warning sticker"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 3,
                        question = "A patient using a capsule-type dry powder inhaler (Rotacap) reports poor symptom control despite 'doing everything right.' On observation, they exhale gently into the device before loading and then inhale. Which is the MOST likely explanation?",
                        prescription = "DPI (Rotacap), improper inhaler technique",
                        options = listOf(
                            "Exhaling into the device introduced moisture causing powder clumping and reduced dose.",
                            "They are holding their breath too long after inhalation.",
                            "They should prime the device by shaking before each use.",
                            "The spacer is required with a DPI — advise using one."
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 4,
                        question = "Which statement about the Trulicity (dulaglutide) prefilled pen is FALSE?",
                        prescription = "Trulicity (dulaglutide) prefilled pen",
                        options = listOf(
                            "You should shake the pen vigorously before each injection to mix the medicine.",
                            "It is a single-use, prefilled, disposable weekly subcutaneous pen.",
                            "After pressing the injection button you must hold the pen against skin until you hear the second click (≈5–10 s).",
                            "Store refrigerated; if kept at room temperature it must be used within the manufacturer’s specified days (e.g., up to 14 days)."
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 5,
                        question = "A new RA patient on weekly methotrexate asks about folic acid to reduce side effects. The BEST counselling statement is:",
                        prescription = "Methotrexate weekly, folic acid supplementation",
                        options = listOf(
                            "Take folic acid daily (eg. lower-dose daily) except on the methotrexate day — follow prescriber’s exact dose.",
                            "Only take folic acid on the same day as methotrexate.",
                            "Avoid folic acid while on methotrexate because it reduces its effect.",
                            "Folic acid is unnecessary with injectable methotrexate."
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 6,
                        question = "Which behavior MOST increases a patient’s risk of life-threatening fentanyl overdose from a patch?",
                        prescription = "Fentanyl transdermal patch",
                        options = listOf(
                            "Applying the patch to the upper outer arm as instructed.",
                            "Using a heating pad over the patch for extra pain-relief.",
                            "Removing the old patch before applying a new one.",
                            "Not cutting the patch and keeping it sealed until use."
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 7,
                        question = "In a hot climate a patient finds their glycerin suppository soft and sticky at room temperature. Best counseling?",
                        prescription = "Glycerin suppository in hot climate",
                        options = listOf(
                            "Warm it briefly under hot water to make insertion easier.",
                            "Chill it briefly in the refrigerator or under cold running water to harden, then insert.",
                            "Break it into pieces and insert fragments.",
                            "Microwave for 10–15 seconds to firm it up."
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 8,
                        question = "For maximum retention and effectiveness of a single-use antifungal vaginal pessary, the MOST practical advice is:",
                        prescription = "Antifungal vaginal pessary",
                        options = listOf(
                            "Insert at bedtime, remain lying down for a short while, and avoid intercourse for the treatment course.",
                            "Insert in the morning and remain active to promote distribution.",
                            "Remove it after 1–2 hours to prevent leakage.",
                            "Use vaginal douches afterward to remove residue and increase absorption."
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 9,
                        question = "A caregiver reports finding two rivastigmine patches adhered to the patient (one old, one new). The patient feels increasingly dizzy and weak. What is the BEST immediate action?",
                        prescription = "Rivastigmine patch overdose",
                        options = listOf(
                            "Ignore — overlapping patches are fine for a short period.",
                            "Remove both patches immediately, wash hands, monitor patient, and contact prescriber/seek medical advice.",
                            "Peel off the older patch only and leave the newer one in place.",
                            "Cut one patch in half to reduce dose and leave both for absorption."
                        ),
                        correctAnswerIndex = 1
                    )
                ),
                locked = true
            ), Lesson(
                id = 17,
                title = "Lab Values Interpretation",
                info = "Numbers tell a story — if you know how to read them. Learn to interpret key lab panels using different tools to support clinical decisions.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "A CBC report is shown: 16,000 / 14.0 + 320,000 / 42. What abnormality does this suggest?",
                        prescription = "CBC values: WBC 16,000, Hb 14.0, Platelets 320,000, Hct 42",
                        options = listOf(
                            "Isolated thrombocytosis",
                            "Leukocytosis, most likely infectious origin",
                            "Hemoconcentration due to dehydration",
                            "Polycythemia vera"
                        ),
                        correctAnswerIndex = 1
                    ),
            MCQ(
                id = 2,
                question = "In a standard CBC cross (+) layout, which value is typically placed in the right bottom position?",
                prescription = "CBC cross layout question",
                options = listOf(
                    "Hematocrit",
                    "Hemoglobin",
                    "Platelet count",
                    "White blood cell count"
                ),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 3,
                question = "A CBC shows: 3,200 / 9.8 + 90,000 / 28. What is the most likely interpretation?",
                prescription = "CBC values: WBC 3,200, Hb 9.8, Platelets 90,000, Hct 28",
                options = listOf(
                    "Isolated anemia",
                    "Combined anemia with leukocytosis",
                    "Pancytopenia",
                    "Thrombocytosis"
                ),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 4,
                question = "A Chem-7 fishbone shows: 135 | ? | 22 / 3.8 | 18 | 1.0 : 95. Which value correctly fills the top middle position?",
                prescription = "Chem-7 fishbone interpretation",
                options = listOf(
                    "Potassium",
                    "Chloride",
                    "Calcium",
                    "Albumin"
                ),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 5,
                question = "Fishbone (Chem-7) shows: 135 | 92 | 22 / 5.6 | 18 | 2.1 : 98. What is the most likely disorder?",
                prescription = "Chem-7: Na 135, Cl 92, Bicarb 22, K 5.6, BUN 18, Cr 2.1, Glucose 98",
                options = listOf(
                    "Metabolic alkalosis due to vomiting",
                    "Hyperchloremic metabolic acidosis",
                    "High anion gap metabolic acidosis with renal impairment",
                    "Respiratory alkalosis with hypokalemia"
                ),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 6,
                question = "Chem-7 fishbone: 147 | 110 | 50 / 3.9 | 21 | 1.0 : 100. Which is most consistent?",
                prescription = "Chem-7: Na 147, Cl 110, Bicarb 50, K 3.9, BUN 21, Cr 1.0, Glucose 100",
                options = listOf(
                    "Chronic kidney disease",
                    "Pre-renal azotemia (↑BUN with near-normal Cr)",
                    "Respiratory alkalosis",
                    "Hypernatremia from SIADH"
                ),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 7,
                question = "Extended LFT fishbone shows: 9.0 | 7.0 | 2.6 / 65 | 70 | 160 | 3.0. Which best describes this pattern?",
                prescription = "LFT: Albumin 3.0, Bilirubin 2.6, ALP 160, AST 65, ALT 70, TP 9.0, Globulin 7.0",
                options = listOf(
                    "Isolated hepatocellular injury",
                    "Cholestatic picture with impaired synthetic function",
                    "Isolated unconjugated hyperbilirubinemia",
                    "Normal liver profile"
                ),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 8,
                question = "LFT fishbone: 9.5 | 7.2 | 3.8 / 200 | 210 | 90 | 0.8. Most likely interpretation?",
                prescription = "LFT: TP 9.5, Globulin 7.2, Bilirubin 3.8, AST 200, ALT 210, ALP 90, Albumin 0.8",
                options = listOf(
                    "Obstructive jaundice",
                    "Acute hepatocellular injury (↑AST/ALT, normal bilirubin)",
                    "Chronic cirrhosis",
                    "Hemolytic anemia with elevated indirect bilirubin"
                ),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 9,
                question = "LFT fishbone: 8.5 | 6.2 | 2.0 / 40 | 45 | 300 | 5.0. Most likely scenario?",
                prescription = "LFT: TP 8.5, Globulin 6.2, Bilirubin 2.0, AST 40, ALT 45, ALP 300, Albumin 5.0",
                options = listOf(
                    "Bone disease or cholestasis (↑ALP, ↑Bilirubin)",
                    "Viral hepatitis (↑AST, ↑ALT)",
                    "Isolated hypoalbuminemia",
                    "Gilbert syndrome"
                ),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 10,
                question = "A pharmacist reviews an 8-year-old male with complicated UTI on Gentamicin 2.5 mg/kg IV q8h. Considering renal function, what is the most appropriate adjustment?",
                prescription = "Patient: 8y, 25kg, 125cm, SCr 1.2, Dx: Complicated UTI (E. coli), Rx: Gentamicin 2.5 mg/kg IV q8h",
                options = listOf(
                    "Continue Gentamicin 2.5 mg/kg IV q8h",
                    "Extend interval to Gentamicin 2.5 mg/kg IV q12h",
                    "Adjust to extended-interval dosing: 7 mg/kg IV q24h",
                    "Switch to oral Ciprofloxacin immediately"
                ),
                correctAnswerIndex = 2
            )
        )
        ,
                true
            ), Lesson(
                id = 18,
                title = "MOAR Review",
                info = "Medication review is more than just checking a list. In this lesson, you’ll analyze MOARs to identify ADRs, interactions, dose adjustments, and lab-related concerns — all in one place.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 19,
                title = "Electrolyte Replacement",
                info = "Managing electrolytes is critical for stability. Learn evidence-based replacement strategies using practical guidelines.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "What is the maximum sodium correction allowed in 24 hours in a patient with chronic hyponatremia?",
                        prescription = "",
                        options = listOf(
                            "4 mEq/L", "6 mEq/L", "8 mEq/L", "10 mEq/L"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 2,
                        question = "What happens after overly rapid correction of severe, chronic hyponatremia?",
                        prescription = "",
                        options = listOf(
                            "Pulmonary edema",
                            "Rebound hyponatremia",
                            "Osmotic demyelination syndrome",
                            "Hyperkalemia"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 3,
                        question = "If 720 mL of hypertonic saline (3% NaCl) is to be given in 1 day, what is the correct way to infuse it over 24 hours?",
                        prescription = "",
                        options = listOf(
                            "Give 250 mL bolus every 6 hours",
                            "100 mL/hr for 7 hours",
                            "50 mL bolus × 2 in first hour, then infuse 620 mL over next 23 hours",
                            "Infuse entire 720 mL evenly over 24 hours"
                        ),
                        correctAnswerIndex = 3
                    ), MCQ(
                        id = 4,
                        question = "In severe hypokalemia (K⁺ < 2.5 mEq/L with symptoms), which line is preferred for IV potassium replacement, and what is the maximum recommended infusion rate?",
                        prescription = "",
                        options = listOf(
                            "Peripheral line, up to 10 mEq/hr",
                            "Central line, up to 20–40 mEq/hr",
                            "Peripheral line, up to 20 mEq/hr",
                            "Central line, up to 10 mEq/hr"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 5,
                        question = "After initiating potassium replacement therapy in a hypokalemic ICU patient, when should serum potassium be rechecked?",
                        prescription = "",
                        options = listOf(
                            "After 1 hour", "After 2 hours", "After 4 hours", "After 6 hours"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 6,
                        question = "In severe hypophosphatemia (serum phosphate < 1 mg/dL), what is the standard IV phosphate repletion dose for a 49 kg patient?",
                        prescription = "",
                        options = listOf(
                            "10 mmol over 4 hours",
                            "15 mmol over 4 hours",
                            "20 mmol over 4 hours",
                            "30 mmol over 8 hours"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 7,
                        question = "In moderate hypophosphatemia (serum phosphate ≥ 1.5 mg/dL), what is the recommended switch?",
                        prescription = "",
                        options = listOf(
                            "Continue IV phosphate repletion",
                            "Switch to oral phosphate replacement",
                            "Administer phosphate as a bolus",
                            "Repeat IV phosphate every 4 hours"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 8,
                        question = "Why is magnesium replaced before potassium in cases of combined hypomagnesemia and hypokalemia?",
                        prescription = "",
                        options = listOf(
                            "Magnesium corrects sodium balance first",
                            "Magnesium enhances phosphate absorption",
                            "Magnesium repletion stabilizes intracellular potassium by restoring Na⁺/K⁺-ATPase function",
                            "Potassium causes magnesium depletion"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 9,
                        question = "In hypokalemia and hypophosphatemia, which electrolyte should be replaced first, and why?",
                        prescription = "",
                        options = listOf(
                            "Replace potassium first to stabilize the myocardium and improve phosphate handling",
                            "Replace phosphate first because potassium depends on it",
                            "Replace calcium first to stabilize membranes",
                            "Replace sodium first to enhance both electrolyte transport"
                        ),
                        correctAnswerIndex = 0
                    ), MCQ(
                        id = 10,
                        question = "Which of the following ECG changes is most characteristic and considered a hallmark feature of hypocalcemia?",
                        prescription = "",
                        options = listOf(
                            "Shortened QT interval",
                            "Tall peaked T waves",
                            "Prolonged QT interval",
                            "ST segment depression"
                        ),
                        correctAnswerIndex = 2
                    )
                ),
                locked = true
            ), Lesson(
                id = 20,
                title = "IV to Oral Switch",
                info = "When the patient improves, so should the route. Master the criteria and timing for IV to oral conversions, optimizing therapy and reducing hospital burden.",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "A 68-year-old man with hospital-acquired pneumonia has been on IV linezolid for 48 hours. He is afebrile for 30 hours, BP 118/72 mmHg, HR 88/min, RR 18/min, CRP falling. He is eating normally, but still has a small draining empyema on chest tube. Which is the most appropriate action?",
                        options = listOf(
                            "Switch to oral linezolid immediately",
                            "Continue IV therapy until empyema resolves",
                            "Switch to oral amoxicillin-clavulanate",
                            "Stop antibiotics since vitals are stable"
                        ),
                        correctAnswerIndex = 1 // Continue IV until empyema resolves
                    ), MCQ(
                        id = 2,
                        question = "A patient on IV moxifloxacin (bioavailability 89%) is clinically stable, afebrile for 26 hrs, and tolerating a full diet. Which is the correct equivalent oral dose?",
                        options = listOf(
                            "200 mg daily", "400 mg daily", "500 mg daily", "750 mg daily"
                        ),
                        correctAnswerIndex = 1 // 400 mg daily
                    ), MCQ(
                        id = 3,
                        question = "Which patient is NOT a candidate for an IV to PO switch today?",
                        options = listOf(
                            "45-year-old, IV metronidazole for intra-abdominal infection, afebrile for 28 hrs, CRP decreasing, tolerating oral diet",
                            "50-year-old, IV ceftriaxone for meningitis, afebrile for 48 hrs, eating well",
                            "60-year-old, IV levofloxacin for UTI, afebrile for 26 hrs, BP 122/80 mmHg, HR 85/min, tolerating oral diet",
                            "35-year-old, IV fluconazole for oral thrush, afebrile for 24 hrs"
                        ),
                        correctAnswerIndex = 1 // Ceftriaxone meningitis → requires IV
                    ), MCQ(
                        id = 5,
                        question = "A 40-year-old woman is on IV fluconazole for candidemia. She is afebrile for 25 hrs, clinically improving, and tolerating oral diet. Fluconazole has ~96% oral bioavailability. What’s the best next step?",
                        options = listOf(
                            "Continue IV therapy until discharge",
                            "Switch to oral fluconazole at equivalent dose",
                            "Reduce fluconazole dose by 50% for oral route",
                            "Stop antifungal therapy"
                        ),
                        correctAnswerIndex = 1 // Switch to oral fluconazole
                    ), MCQ(
                        id = 6,
                        question = "A patient on IV metronidazole develops persistent vomiting and diarrhea. His vitals are stable. Which is the correct decision?",
                        options = listOf(
                            "Proceed with oral switch",
                            "Continue IV due to unreliable GI absorption",
                            "Reduce oral dose and monitor",
                            "Stop antibiotics"
                        ),
                        correctAnswerIndex = 1 // Continue IV
                    ), MCQ(
                        id = 7,
                        question = "Which benefit of IV to PO switch is incorrect according to the department’s guidelines?",
                        options = listOf(
                            "Reduced hospital-acquired bacteremia",
                            "Reduced preparation errors",
                            "Faster onset of action than IV",
                            "Lower drug administration cost"
                        ),
                        correctAnswerIndex = 2 // Faster onset is incorrect
                    ), MCQ(
                        id = 8,
                        question = "A 33-year-old man with cellulitis is receiving IV levofloxacin 500 mg daily. His vitals: Temp 37.2°C for last 24 hrs, BP 122/74 mmHg, HR 84/min, RR 16/min. WBC trending down, eating well. What should the pharmacist recommend?",
                        options = listOf(
                            "Continue IV until WBC normalizes completely",
                            "Switch to oral levofloxacin 500 mg daily",
                            "Switch to oral doxycycline",
                            "Stop antibiotics after 3 days"
                        ),
                        correctAnswerIndex = 1 // Switch to oral levofloxacin
                    ), MCQ(
                        id = 9,
                        question = "A patient is receiving IV omeprazole 40 mg daily for GERD prophylaxis and is now on a regular diet. Oral bioavailability is ~100%. Which oral dose is equivalent?",
                        options = listOf(
                            "20 mg daily", "40 mg daily", "60 mg daily", "80 mg daily"
                        ),
                        correctAnswerIndex = 1 // 40 mg daily
                    ), MCQ(
                        id = 10,
                        question = "Which condition alone would justify continuing IV therapy despite the patient meeting all other switch criteria?",
                        options = listOf(
                            "Afebrile for 24 hrs",
                            "Deep-seated infection",
                            "Functional GI tract",
                            "CRP reduction"
                        ),
                        correctAnswerIndex = 1 // Deep-seated infection
                    ), MCQ(
                        id = 11,
                        question = "You are conducting a hospital-wide IV-to-oral switch review. A patient on Voriconazole IV is clinically stable and meets all ABCD switch criteria. The IV formulation costs about $11.43 per dose, while the oral formulation costs about $0.52 per dose with 96% bioavailability. Which statement best describes the cost impact of switching this patient to oral therapy?",
                        options = listOf(
                            "It would save the least per dose among common switchable drugs",
                            "It would save about $1.30 per dose",
                            "It would save over $10 per dose, the highest cost saving among common IV-to-oral switch options.",
                            "Cost savings are minimal due to high oral price"
                        ),
                        correctAnswerIndex = 2 // Over $10 per dose saving
                    )
                ),
                true
            ), Lesson(
                id = 21,
                title = "Dispensing of Schedule B and E drugs",
                info = "",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "A 45-year-old male presents with a prescription for Diazepam 10 mg TDS × 30 days, signed by a house officer. Which is the correct action?",
                        prescription = "Diazepam 10 mg TDS × 30 days (House officer signature)",
                        options = listOf(
                            "Dispense full 30-day supply, since the prescriber is a registered MBBS doctor under national law",
                            "Refuse supply, as Schedule B drugs require consultant authorization and controlled-drug register entry before dispensing",
                            "Dispense a 7-day starter pack and request follow-up with a psychiatrist for continuation approval",
                            "Substitute with Lorazepam 1 mg × TDS (equivalent dose) without contacting prescriber, as it has lower dependence risk"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 2,
                        question = "A patient requests Tramadol 50 mg capsules without prescription for chronic back pain. What should the pharmacist do?",
                        prescription = "Patient request: Tramadol 50 mg without prescription",
                        options = listOf(
                            "Dispense only 10 capsules and record in daily sales log, as Tramadol carries withdrawal risk",
                            "Dispense requested quantity but ensure controlled-substance register entry with CNIC number",
                            "Refuse supply and explain Tramadol is a controlled substance requiring a valid prescription from an authorized prescriber",
                            "Offer OTC alternatives such as diclofenac or naproxen, provided patient has no renal/GI contraindications"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 3,
                        question = "When dispensing Buprenorphine for opioid dependence, which step is legally essential?",
                        prescription = "Buprenorphine (opioid dependence therapy)",
                        options = listOf(
                            "May be dispensed without prescription if supplied under pharmacist supervision at low doses (<2 mg)",
                            "Must be entered in the narcotic register with prescriber’s full name, patient CNIC, date, and exact dispensed quantity",
                            "Pharmacist can titrate dose based on observed withdrawal symptoms if patient cannot access physician",
                            "Can be stored with other opioids provided monthly inventory is reconciled, without daily register entry"
                        ),
                        correctAnswerIndex = 1
                    ), MCQ(
                        id = 4,
                        question = "How must Benzodiazepines (e.g., Alprazolam, Clonazepam) be stored in the pharmacy?",
                        prescription = "Benzodiazepine storage regulations",
                        options = listOf(
                            "On routine prescription shelf, segregated from OTC drugs using red-coded bins for control",
                            "Refrigerated at 2–8 °C with access limited to pharmacists only",
                            "In a locked, restricted-access controlled-drug cabinet with daily balance reconciliation and monthly audit",
                            "In the safe with narcotics but without need for daily reconciliation since they are psychotropics"
                        ),
                        correctAnswerIndex = 2
                    ), MCQ(
                        id = 5,
                        question = "When dispensing Hydrocortisone Sodium IV injection (Schedule E), which is the correct requirement?",
                        prescription = "Hydrocortisone Sodium IV (Schedule E drug)",
                        options = listOf(
                            "No additional precautions; it is a commonly used corticosteroid",
                            "Must be stored under lock & key and recorded in Schedule E register with prescriber details, patient name, and batch number",
                            "Can be supplied in life-threatening emergencies without documentation, with records updated retrospectively",
                            "Requires external-use labeling and segregation from parenteral preparations to avoid misuse"
                        ),
                        correctAnswerIndex = 1
                    )
                ), locked = true

            ),
            Lesson(
                id = 22,
                title = "Drug Labels",
                info = "A pharmacist prepares the following label for an admitted patient:\n" +
                        "Patient Name: ABC\n" +
                        "MR Number: 45678\n" +
                        "OPD/INP: INP\n" +
                        "Generic Name: Metformin\n" +
                        "Brand Name: Glucophage\n" +
                        "Dose: 500 mg PO BD\n" +
                        "Quantity: 30 tablets\n" +
                        "Label Print Date: 18-Aug-2025\n" +
                        "Pharmacy Location: Y5\n",
                mcqs = listOf(
                    MCQ(
                        id = 1,
                        question = "Which of the following changes or additions are necessary to ensure the inpatient label meets safety and regulatory standards?",
                        prescription = "Label: Metformin 500 mg PO BD, 30 tablets, details provided.",
                        options = listOf(
                            "Expiry Date & Special Instructions (e.g., Take with food)",
                            "Barcode/Barcode Number & Patient Ward/Location",
                            "Last Dose Time & Patient Weight",
                            "Both A and B"
                        ),
                        correctAnswerIndex = 3
                    ),
            MCQ(
                id = 2,
                question = "You are dispensing Cetirizine 10 mg. Which special instruction should be included?",
                prescription = "Cetirizine 10 mg tablet",
                options = listOf(
                    "Take in the morning to reduce daytime drowsiness",
                    "Take at night due to potential drowsiness",
                    "Take with or without food for better absorption",
                    "Use within 28 days after opening"
                ),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 3,
                question = "You are dispensing a Salbutamol inhaler. Which special instruction should be included?",
                prescription = "Salbutamol Inhaler",
                options = listOf(
                    "Use within 28 days after opening",
                    "Take only at bedtime for best effect",
                    "Prime the inhaler before first use and after 28 days",
                    "Shake well before use every time"
                ),
                correctAnswerIndex = 3
            ),
            MCQ(
                id = 4,
                question = "You are dispensing Ibuprofen 400 mg tablets. Which special instruction should be included?",
                prescription = "Ibuprofen 400 mg tablet",
                options = listOf(
                    "Take on an empty stomach for faster absorption",
                    "Take with food or milk to avoid stomach irritation",
                    "Avoid bedtime dosing to reduce nocturnal reflux",
                    "Use within 7 days after opening"
                ),
                correctAnswerIndex = 1
            ),
            MCQ(
                id = 5,
                question = "You are dispensing Co-Amoxiclav suspension. Which special instruction should be included?",
                prescription = "Co-Amoxiclav suspension",
                options = listOf(
                    "Use within 7 days after reconstitution and store in refrigerator",
                    "Take only at night for better tolerance",
                    "Shake well before each dose; extended-release formulation",
                    "Avoid taking with meals to improve absorption"
                ),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 6,
                question = "You are dispensing Metformin XR 500 mg. Which special instruction should be included?",
                prescription = "Metformin XR 500 mg tablet",
                options = listOf(
                    "Take on an empty stomach for faster absorption",
                    "Chew or crush the tablet to improve onset",
                    "Extended-release; do not chew or crush the tablet",
                    "Avoid use within 28 days of opening"
                ),
                correctAnswerIndex = 2
            ),
            MCQ(
                id = 7,
                question = "You are dispensing Heparin injection. Which special instruction should be included?",
                prescription = "Heparin injection",
                options = listOf(
                    "Use within 28 days of opening; monitor APTT.",
                    "Take only with meals to reduce GI upset",
                    "Do not crush, chew, or inject rapidly",
                    "Avoid bedtime dosing"
                ),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 8,
                question = "You are dispensing Gravinate. Which special instruction should be included?",
                prescription = "Gravinate (dimenhydrinate)",
                options = listOf(
                    "Causes drowsiness; slow IV over 2–4 minutes; do not mix with Tramal",
                    "Take on an empty stomach to improve absorption",
                    "Use within 28 days after opening",
                    "Crush or chew tablets to speed effect"
                ),
                correctAnswerIndex = 0
            ),
            MCQ(
                id = 9,
                question = "You are dispensing Flagyl 400 mg tablets. Which special instruction should be included?",
                prescription = "Flagyl 400 mg tablet",
                options = listOf(
                    "Take on an empty stomach",
                    "Do not take on an empty stomach",
                    "Extended-release; do not crush or chew",
                    "Causes drowsiness; take at night"
                ),
                correctAnswerIndex = 0
            )
        )
        ,
                locked = true
            )
        )
        return lessons
    }
}