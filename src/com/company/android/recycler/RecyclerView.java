package com.company.android.recycler;

public class RecyclerView {

    Adapter adapter;
    LayoutManager layoutManager;

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;

    }

    public void setLayoutManager(LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public void showList() {
        for (int i = 0; i < adapter.itemCount(); i++) {
            String itemViewType = adapter.itemViewType(i);
            ViewHolder viewHolder = adapter.createViewHolder(itemViewType);
            adapter.setUpViewHolder(viewHolder, i);
            layoutManager.setViewHolder(viewHolder);
        }

    }


    abstract public static class Adapter<T extends ViewHolder> {

        abstract public T createViewHolder(String itemViewType);

        abstract public void setUpViewHolder(T viewHolder,int position);

        abstract public int itemCount();

        abstract public String itemViewType(int position);

    }

    public static class ViewHolder {


    }
}
