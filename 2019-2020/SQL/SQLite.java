import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
/*Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;*/
 
/**
 *
 * @author sqlitetutorial.net
 */
public class SQLite extends JFrame
{
    private static Connection conn;
    public static DataStorage<String> dt;
    private static JFrame frame1;
    private static ResultSet rs;
    private static JTable table;
    private static String from;
    private static PreparedStatement pst;
    
    public static void connect() 
    {
        conn = null;
        try 
        {
            String conString = "jdbc:sqlite:chinook.db";
            // create a connection to the database
            conn = DriverManager.getConnection(conString);            
            //System.out.println("Připojení k databázi SQLite bylo zřízeno");       
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        } 
        finally 
        {
    
        }
    }
    
    public static void showTableData(String select) 
    {
        String sqlQuery;
        frame1 = new JFrame("Database Search Result");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        switch(select)
        {
            case "Žánr": sqlQuery ="SELECT genres.name as 'info' from genres"; String columnNames[] = {"Žánr"}; model.setColumnIdentifiers(columnNames); break;
            case "Kapela": sqlQuery ="SELECT artists.name as 'info' from artists"; String columnNamesA[] = {"Skupina"}; model.setColumnIdentifiers(columnNamesA); break;
            case "Album": sqlQuery ="SELECT albums.title as 'info' from albums"; String columnNamesB[] = {"Album"}; model.setColumnIdentifiers(columnNamesB); break;
            case "Pisen": sqlQuery ="SELECT tracks.name as 'info' from tracks"; String columnNamesC[] = {"Písně"}; model.setColumnIdentifiers(columnNamesC); break;
            default: sqlQuery ="SELECT genres.name as 'info' from genres"; String columnNamesD[] = {"Žánr"}; model.setColumnIdentifiers(columnNamesD); break;
        }
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        String col1 = "";
        try 
        {
            pst = conn.prepareStatement(sqlQuery);
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) 
            {
                col1 = rs.getString("info");
                model.addRow(new Object[]{col1});
                i++;
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(400, 300);
    }
    
    public static void selectAll()
    {
        String sqlQuery ="SELECT genres.name as 'žánr',artists.name as 'název_skupiny',"+
        "albums.title as 'název_alba', tracks.name as 'název_skladby' "+
        "from genres,artists, albums,tracks where genres.genreID=tracks.genreID "+
        "and tracks.albumID=albums.albumID and albums.artistID=artists.artistID "+
        "order by  žánr, název_skupiny ";
        frame1 = new JFrame("Database Search Result");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel();
        String[] columnNames = {"Zanr", "Skupina", "Album", "Pisen"};
        model.setColumnIdentifiers(columnNames);
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        String col1 = "";
        String col2 = "";
        String col3 = "";
        String col4 = "";
        try 
        {
            pst = conn.prepareStatement(sqlQuery);
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) 
            {
                col1 = rs.getString("žánr");
                col2 = rs.getString("název_skupiny");
                col3 = rs.getString("název_alba");
                col4 = rs.getString("název_skladby");
                model.addRow(new Object[]{col1, col2, col3, col4});
                i++;
            }
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        frame1.add(scroll);
        frame1.setVisible(true);
        frame1.setSize(400, 300);
    }
    
    public static void main(String[] args) 
    {
        connect();
        selectAll();
    }
}