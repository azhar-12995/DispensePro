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
                            "Inappropriate Dose",
                            "Allergy",
                            "Drug-Drug Interaction",
                            "No error"
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                            prescription =
                                "Patient: __________________\n" +
                                        "Drug: Azithromycin 500 mg OD x 3 days\n" +
                                        "Directions: Take after meals\n" +
                                        "Prescriber: Dr. XYZ (Signed)\n" +
                                        "Date: 07-Aug-2025, Valid for 1 month",
                            options = listOf(
                                "Superscription",
                                "Subscription",
                                "Validity",
                                "Prescription is complete"
                            ),
                            correctAnswerIndex = 0
                        ),
                MCQ(
                    id = 2,
                    question = "What part of the prescription is missing?",
                    prescription =
                        "Patient: Me ABC, 45 yrs\n" +
                                "Directions: Take once daily for 3 days\n" +
                                "Prescriber: Dr. XYZ (Signed)\n" +
                                "Date: 07-Aug-2025, Valid for 1 month",
                    options = listOf(
                        "Superscription",
                        "Inscription",
                        "Signature",
                        "Prescription is complete"
                    ),
                    correctAnswerIndex = 0
                ),
                MCQ(
                    id = 3,
                    question = "What part of the prescription is missing?",
                    prescription =
                        "Patient: Miss ABC, 34 yrs, weight: 60 kg\n" +
                                "Drug: Metronidazole 400 mg PO TID x 5 days\n" +
                                "Prescriber: Dr. XYZ (Signed)\n" +
                                "Date: 07-Aug-2025, Valid for 1 month",
                    options = listOf(
                        "Superscription",
                        "Subscription",
                        "Inscription",
                        "Prescription is complete"
                    ),
                    correctAnswerIndex = 1
                ),
                MCQ(
                    id = 4,
                    question = "What part of the prescription is missing?",
                    prescription =
                        "Patient: Mr ABC, 25 yrs\n" +
                                "Drug: Paracetamol 500 mg PO QID PRN\n" +
                                "Directions: Take in case of fever\n" +
                                "Date: 07-Aug-2025, Valid for 1 month\n" +
                                "Prescriber info is not mentioned.",
                    options = listOf(
                        "Signature",
                        "Subscription",
                        "Superscription",
                        "Prescription is complete"
                    ),
                    correctAnswerIndex = 0
                ),
                MCQ(
                    id = 5,
                    question = "What part of the prescription is missing?",
                    prescription =
                        "Patient: Miss Lu, 65 yrs\n" +
                                "Drug: Clonazepam 0.5 mg OD x 14 days\n" +
                                "Directions: Take at bedtime\n" +
                                "Prescriber: Dr. XYZ (Signed)\n" +
                                "Date: 01-Jan-2023",
                    options = listOf(
                        "Subscription",
                        "Validity",
                        "Superscription",
                        "Prescription is complete"
                    ),
                    correctAnswerIndex = 1
                ),
                MCQ(
                    id = 6,
                    question = "What part of the prescription is missing?",
                    prescription =
                        "Patient: Mr ABC, 50 yrs, weight: 90kg\n" +
                                "Drug: Amoxicillin/Clavulanate 625 mg TID x 7 days\n" +
                                "Directions: Take with meals\n" +
                                "Prescriber: Dr. XYZ (Signed)\n" +
                                "Date: 01-Aug-2025, Valid for 7 days",
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
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 6,
                title = "Check List While Dispensing",
                info = "Some medications carry higher risks — and require extra vigilance before reaching the patient. In this lesson, you’ll learn to apply critical safety checks while dispensing high-risk drugs, ensuring every step meets clinical and legal standards.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 7,
                title = "Renal Dose Adjustment",
                info = "Kidneys play a vital role in drug clearance — and impaired function demands careful dose modification. In this lesson, you'll learn how to adjust medications based on renal function using different tools, ensuring safe and effective therapy for patients with compromised kidney function.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 8,
                title = "Hepatic Dose Adjustment",
                info = "When the liver is compromised, drug metabolism changes — and so must the dose. In this lesson, you'll learn how to assess liver function and adjust medication dosing accordingly to avoid toxicity and ensure therapeutic effectiveness.",
                mcqs = emptyList(),
                true

            ), Lesson(
                id = 9,
                title = "Pediatric Dose Adjustment",
                info = "Children aren't just small adults — their dosing requires precision. In this lesson, you’ll learn how to calculate appropriate pediatric doses using different tools, and adjust therapy based on age, weight, and organ function to ensure safe, effective treatment.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 10,
                title = "Chemo Dose Adjustment",
                info = "Precision is everything in chemotherapy — too little risks failure, too much causes harm. In this lesson, you'll learn how to adjust chemo doses based on body surface area and clinical parameters, ensuring optimal safety and efficacy for each patient.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 11,
                title = "Vancomycin Dose Adjustment",
                info = "Vancomycin requires careful monitoring to balance efficacy and toxicity. In this lesson, you’ll learn how to adjust dosing based on levels and kinetics using different tools.",
                mcqs = emptyList(),
                true
            ), Lesson(
                id = 12,
                title = "Compounding Calculations",
                info = "Precision is key when preparing personalized medications. This lesson guides you through essential compounding calculations, ensuring accuracy, safety, and compliance in every preparation.",
                mcqs = emptyList(),
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                mcqs = emptyList(),
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
                            "4 mEq/L",
                            "6 mEq/L",
                            "8 mEq/L",
                            "10 mEq/L"
                        ),
                        correctAnswerIndex = 2
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
                        id = 5,
                        question = "After initiating potassium replacement therapy in a hypokalemic ICU patient, when should serum potassium be rechecked?",
                        prescription = "",
                        options = listOf(
                            "After 1 hour",
                            "After 2 hours",
                            "After 4 hours",
                            "After 6 hours"
                        ),
                        correctAnswerIndex = 2
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                    ),
                    MCQ(
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
                mcqs = emptyList(),
                true
            )
        )
        return lessons
    }
}