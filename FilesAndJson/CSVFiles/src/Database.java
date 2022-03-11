public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
        /* TODO This constructor should take the contents of a CSV file
            and initialize the memmber variables of the Database class.
        */
        String[] rows = contents.trim().split("\n");
        this.colNames = rows[0].trim().split(",");
        int numCols = this.colNames.length;
        this.numRows = rows.length - 1;
        this.data = new String[this.numRows][numCols];
        for (int i = 1; i < this.numRows; i++)
            this.data[i - 1] = rows[i].trim().split(",");
    }

    public String getValue(String columnName, int row) {
        /* TODO: This method should return the data contained on row "row"
        and the column matching @columname
        */
        // find the index of this column
        int index = -1;
        for (int i = 0; i < this.colNames.length; i++)
            if (this.colNames[i].equals(columnName)) {
                index = i;
                break;
            }
        // return the element at given index
        return this.data[row][index];
    }

}


