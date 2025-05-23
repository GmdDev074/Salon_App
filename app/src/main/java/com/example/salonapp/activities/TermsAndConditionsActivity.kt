package com.example.salonapp.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.salonapp.R

class TermsAndConditionsActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var continueButton: androidx.appcompat.widget.AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_and_conditions)

        val recyclerView = findViewById<RecyclerView>(R.id.terms_conditions_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TermsAdapter(getTermsItems())

        continueButton = findViewById(R.id.continue_button)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Terms and Conditions"
        toolbar.setTitleTextColor(resources.getColor(R.color.white))
        toolbar.navigationIcon = resources.getDrawable(R.drawable.baseline_arrow_back_24)
        toolbar.setNavigationOnClickListener { onBackPressed() }

        continueButton.setOnClickListener {
            val intent = Intent(this, RegisterSalonActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getTermsItems(): List<TermsItem> {
        return listOf(
            TermsItem("Acceptance of Terms",
                "Using the App signifies acceptance of these Terms, which may be updated periodically. Check this page regularly for changes."),
            TermsItem("Eligibility",
                "Users must be at least 13 years old to access login, signup, or salon registration features."),
            TermsItem("License to Use",
                "A non-exclusive, non-transferable license is granted for personal or business use within the App."),
            TermsItem("Login Requirements",
                "Users must provide valid credentials for login; sharing accounts is prohibited."),
            TermsItem("Signup Obligations",
                "Accurate information is required during signup; falsified data may lead to account suspension."),
            TermsItem("Data Storage",
                "User data, including login details and salon information, is stored securely and may be retained as per applicable privacy laws."),
            TermsItem("Data Access",
                "Users can access and update their data through the App’s profile settings."),
            TermsItem("Notifications",
                "The App may send notifications for updates, promotions, or service reminders; opt-out is available in settings."),
            TermsItem("Salon Registration",
                "Salon owners must provide complete details (e.g., business name, location) for registration approval."),
            TermsItem("Service Provision",
                "Registered salons must offer services as advertised; misrepresentation may result in removal."),
            TermsItem("Digital Payments",
                "The App supports digital payments; users must comply with payment platform terms."),
            TermsItem("Cash Payments",
                "Cash transactions are at the user’s risk; the App is not liable for disputes outside its system."),
            TermsItem("Premium Plan Requirement",
                "Salon registration and advanced features require a premium plan subscription."),
            TermsItem("Location Features",
                "Map integration allows location sharing; users must grant permission for functionality."),
            TermsItem("Location Accuracy",
                "The App strives for accurate location data but is not liable for mapping errors."),
            TermsItem("Services Features",
                "Service listings (male, female, combined) must be accurate and updated regularly."),
            TermsItem("Privacy Policy Updates",
                "Changes to the privacy policy will be notified in-app; continued use implies acceptance."),
            TermsItem("App Usage Restrictions",
                "The App must not be used for illegal activities or to harass others."),
            TermsItem("Prohibited Content",
                "Uploading offensive or inappropriate content is strictly forbidden."),
            TermsItem("Rules Violation",
                "Violating terms may result in account suspension or legal action as per applicable laws."),
            TermsItem("Map Integration",
                "Users must comply with map provider terms when using location features."),
            TermsItem("Account Security",
                "Users are responsible for maintaining account security; lost credentials are not recoverable by the App."),
            TermsItem("Data Deletion",
                "Users can request data deletion, subject to legal retention periods."),
            TermsItem("Service Availability",
                "The App aims for continuous service but may face downtime for maintenance."),
            TermsItem("Third-Party Links",
                "Links to external sites are not endorsed; use them at your own risk."),
            TermsItem("Intellectual Property",
                "App content and logos are owned by us or licensors; unauthorized use is prohibited."),
            TermsItem("User Conduct",
                "Respectful interaction with other users and salons is required."),
            TermsItem("Payment Disputes",
                "Disputes with digital or cash payments must be resolved directly with the involved party."),
            TermsItem("Premium Plan Benefits",
                "Premium plans offer enhanced features; cancellation follows subscription terms."),
            TermsItem("Location Sharing",
                "Sharing location data is optional but required for certain salon services."),
            TermsItem("Service Updates",
                "Salons must update service offerings to reflect current capabilities."),
            TermsItem("App Updates",
                "Users must accept updates to continue using the App."),
            TermsItem("Termination of Access",
                "We may terminate access for policy violations without notice."),
            TermsItem("Liability Limitation",
                "The App is not liable for damages from use, including payment or location issues."),
            TermsItem("No Warranty",
                "The App is provided ‘as is’ without guarantees of uninterrupted service."),
            TermsItem("Feedback Usage",
                "Feedback may be used to improve the App without compensation."),
            TermsItem("Severability",
                "Invalid terms do not affect the enforceability of others."),
            TermsItem("Force Majeure",
                "Delays due to unforeseen events are not our liability."),
            TermsItem("Compliance with Laws",
                "Use the App per the country where the App works/launches applies security rules and policies."),
            TermsItem("Dispute Resolution",
                "Disputes are resolved through arbitration as per privacy policy guidelines."),
            TermsItem("User Support",
                "Support is offered at our discretion; response times may vary."),
            TermsItem("Content Moderation",
                "We may remove content violating terms or laws."),
            TermsItem("Indemnification",
                "Users indemnify us against claims from misuse or violations."),
            TermsItem("Data Usage",
                "Data may be used for App improvement, per privacy policy."),
            TermsItem("Export Controls",
                "Do not use the App in violation of export laws."),
            TermsItem("Service Restrictions",
                "Salons cannot offer unlisted or prohibited services."),
            TermsItem("Payment Security",
                "The App ensures secure transactions but is not liable for fraud outside its control."),
            TermsItem("Map Usage",
                "Misuse of map features (e.g., spoofing) is prohibited."),
            TermsItem("Premium Plan Renewal",
                "Premium plans auto-renew unless canceled per terms."),
            TermsItem("App Distribution",
                "Redistribution of the App is not allowed."),
            TermsItem("User Verification",
                "Salon owners may need to verify identity for registration approval."),
            TermsItem("Service Booking Limits",
                "Users and salons are subject to booking limits to ensure fair usage."),
            TermsItem("Payment Refunds",
                "Refunds for premium plans or services are subject to our refund policy."),
            TermsItem("Service Ratings",
                "Users can rate salons; fraudulent reviews may be removed."),
            TermsItem("Data Backup",
                "The App does not back up user data; users are responsible for their own backups."),
            TermsItem("Feature Access",
                "Some features may be region-specific or require additional permissions."),
            TermsItem("Salon Profile Updates",
                "Salons must keep profiles updated to maintain visibility."),
            TermsItem("User Reporting",
                "Users can report violations; we investigate at our discretion."),
            TermsItem("Service Cancellation",
                "Cancellations must follow salon-specific policies within the App."),
            TermsItem("Premium Support",
                "Premium users receive priority support, subject to availability."),
            TermsItem("Location Privacy",
                "Location data is encrypted but shared with salons for service delivery."),
            TermsItem("App Analytics",
                "Anonymous usage data may be collected to improve performance."),
            TermsItem("Service Verification",
                "Salons must verify service availability before listing."),
            TermsItem("User Suspension",
                "Repeated violations may lead to permanent account suspension."),
            TermsItem("Payment Methods",
                "New payment methods may be added; legacy methods may be discontinued."),
            TermsItem("Map Data Usage",
                "Excessive map usage may incur additional costs borne by the user."),
            TermsItem("Service Disputes",
                "Service-related disputes must be escalated within the App."),
            TermsItem("Premium Trial",
                "Trial periods for premium plans may have limited features."),
            TermsItem("User Feedback",
                "Feedback must be constructive and non-defamatory."),
            TermsItem("Service Scheduling",
                "Scheduling conflicts must be resolved by users and salons directly."),
            TermsItem("Data Transfer",
                "User data may be transferred to third-party processors with privacy safeguards."),
            TermsItem("Salon Certification",
                "Salons may need to provide certification for certain services."),
            TermsItem("App Accessibility",
                "The App aims for accessibility but may not meet all standards."),
            TermsItem("Notification Frequency",
                "Users can set notification preferences to manage frequency."),
            TermsItem("Service Downtime",
                "Scheduled service downtime will be announced in advance."),
            TermsItem("User Profile Deletion",
                "Deleting a profile removes associated data, subject to retention policies."),
            TermsItem("Premium Discounts",
                "Discounts on premium plans are at our discretion and non-transferable."),
            TermsItem("Map Permissions",
                "Revoking map permissions may disable location-based features.")
        )
    }

    data class TermsItem(
        val heading: String,
        val description: String
    )

    inner class TermsAdapter(private val items: List<TermsItem>) : RecyclerView.Adapter<TermsAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_terms_and_conditions, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.headingText.text = item.heading
            holder.descriptionText.text = item.description
        }

        override fun getItemCount(): Int = items.size

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val headingText: TextView = itemView.findViewById(R.id.heading_text)
            val descriptionText: TextView = itemView.findViewById(R.id.description_text)
        }
    }
}