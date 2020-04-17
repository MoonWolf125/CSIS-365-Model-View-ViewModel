package com.msum.csis365.mvvmlab.view.contact.list;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.msum.csis365.mvvmlab.model.Contact;
import com.msum.csis365.mvvmlab.view.custom.ContactRowView;
import com.msum.csis365.mvvmlab.view.custom.IContactRowListener;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private final IContactRowListener contactRowListener;

    private List<Contact> contacts = new ArrayList<>();

    ContactsAdapter(IContactRowListener contactRowListener) {
        this.contactRowListener = contactRowListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(new ContactRowView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.rowView.setup(contacts.get(position), contactRowListener);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ContactRowView rowView;

        ViewHolder(@NonNull ContactRowView itemView) {
            super(itemView);
            rowView = itemView;
        }
    }
}
