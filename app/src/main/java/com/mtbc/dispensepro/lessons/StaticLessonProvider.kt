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
                    // Example MCQ for Appropriateness Review
                    MCQ(
                        id = 1,
                        question = "What is the first step in appropriateness review?",
                        options = listOf(
                            "Check patient history",
                            "Verify prescription",
                            "Assess drug interactions"
                        ),
                        correctAnswerIndex = 1
                    ),
                    MCQ(
                        id = 2,
                        question = "Which of the following is NOT a factor to consider in appropriateness review?",
                        options = listOf(
                            "Patient age",
                            "Drug cost",
                            "Allergies"
                        ),
                        correctAnswerIndex = 1
                    )
                )
            ), Lesson(
                id = 2,
                title = "Auxiliary Labels",
                info = "Behind every label is a critical safety message. In this lesson, you'll explore how simple warnings can prevent serious harm. Learn how to recognize, apply, and interpret auxiliary labels that ensure patients use medications safely and effectively."
            ), Lesson(
                id = 3,
                title = "High Alert Medications",
                info = "Some medications demand extra caution — even a small error can lead to serious harm. In this lesson, you'll learn how to identify high alert drugs, use labeling systems and apply double-check processes to ensure patient safety at every step."
            ), Lesson(
                id = 4,
                title = "Parts of a Prescription",
                info = "A prescription is more than just a list of medicines — it's a legal and clinical document. In this lesson, you'll learn to identify each essential component and determine whether a prescription is complete, valid, and ready for dispensing."
            ), Lesson(
                id = 5,
                title = "Therapeutic Drug Monitoring (TDM)",
                info = "Some drugs require more than just dosing — they demand close monitoring to stay safe and effective. In this lesson, you'll explore the principles of TDM using medications, and learn how to interpret levels to guide clinical decisions."
            ), Lesson(
                id = 6,
                title = "Check List While Dispensing",
                info = "Some medications carry higher risks — and require extra vigilance before reaching the patient. In this lesson, you’ll learn to apply critical safety checks while dispensing high-risk drugs, ensuring every step meets clinical and legal standards."
            ), Lesson(
                id = 7,
                title = "Renal Dose Adjustment",
                info = "Kidneys play a vital role in drug clearance — and impaired function demands careful dose modification. In this lesson, you'll learn how to adjust medications based on renal function using different tools, ensuring safe and effective therapy for patients with compromised kidney function."
            ), Lesson(
                id = 8,
                title = "Hepatic Dose Adjustment",
                info = "When the liver is compromised, drug metabolism changes — and so must the dose. In this lesson, you'll learn how to assess liver function and adjust medication dosing accordingly to avoid toxicity and ensure therapeutic effectiveness."
            ), Lesson(
                id = 9,
                title = "Pediatric Dose Adjustment",
                info = "Children aren't just small adults — their dosing requires precision. In this lesson, you’ll learn how to calculate appropriate pediatric doses using different tools, and adjust therapy based on age, weight, and organ function to ensure safe, effective treatment."
            ), Lesson(
                id = 10,
                title = "Chemo Dose Adjustment",
                info = "Precision is everything in chemotherapy — too little risks failure, too much causes harm. In this lesson, you'll learn how to adjust chemo doses based on body surface area and clinical parameters, ensuring optimal safety and efficacy for each patient."
            ), Lesson(
                id = 11,
                title = "Vancomycin Dose Adjustment",
                info = "Vancomycin requires careful monitoring to balance efficacy and toxicity. In this lesson, you’ll learn how to adjust dosing based on levels and kinetics using different tools."
            ), Lesson(
                id = 12,
                title = "Compounding Calculations",
                info = "Precision is key when preparing personalized medications. This lesson guides you through essential compounding calculations, ensuring accuracy, safety, and compliance in every preparation."
            ), Lesson(
                id = 13,
                title = "Crash Cart",
                info = "In emergencies, every second counts. Learn how to manage crash cart medications, maintain inventory, and ensure readiness for life-saving interventions at any moment."
            ), Lesson(
                id = 14,
                title = "Narcotics and Their Dispensing",
                info = "Handling controlled substances requires strict compliance. This lesson covers prescribing rules, dispensing limits, and documentation practices and controlled day supply regulations."
            ), Lesson(
                id = 15,
                title = "Emergency Room (ER): Antidote Protocols",
                info = "Antidotes can mean the difference between life and death. Explore emergency medicine protocols and antidote guidelines to respond quickly and accurately in critical situations."
            ), Lesson(
                id = 16,
                title = "Counseling",
                info = "Effective communication improves outcomes. This lesson teaches how to counsel patients during dispensing and discharge, with hands-on scenarios and more."
            ), Lesson(
                id = 17,
                title = "Lab Values Interpretation",
                info = "Numbers tell a story — if you know how to read them. Learn to interpret key lab panels using different tools to support clinical decisions."
            ), Lesson(
                id = 18,
                title = "MOAR Review",
                info = "Medication review is more than just checking a list. In this lesson, you’ll analyze MOARs to identify ADRs, interactions, dose adjustments, and lab-related concerns — all in one place."
            ), Lesson(
                id = 19,
                title = "Electrolyte Replacement",
                info = "Managing electrolytes is critical for stability. Learn evidence-based replacement strategies using practical guidelines."
            ), Lesson(
                id = 20,
                title = "IV to Oral Switch",
                info = "When the patient improves, so should the route. Master the criteria and timing for IV to oral conversions, optimizing therapy and reducing hospital burden."
            )
        )
        return lessons
    }
}