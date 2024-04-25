//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.04.25 at 10:03:49 AM BST
//


package net.sf.mpxj.conceptdraw.schema;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import net.sf.mpxj.Priority;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the net.sf.mpxj.conceptdraw.schema package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OutlineNumber_QNAME = new QName("http://www.schemas.conceptdraw.com/cdprj/document.xsd", "OutlineNumber");
    private final static QName _Priority_QNAME = new QName("http://www.schemas.conceptdraw.com/cdprj/document.xsd", "Priority");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.sf.mpxj.conceptdraw.schema
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     *
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ViewProperties }
     *
     */
    public ViewProperties createViewProperties() {
        return new ViewProperties();
    }

    /**
     * Create an instance of {@link StyleProject }
     *
     */
    public StyleProject createStyleProject() {
        return new StyleProject();
    }

    /**
     * Create an instance of {@link Callouts }
     *
     */
    public Callouts createCallouts() {
        return new Callouts();
    }

    /**
     * Create an instance of {@link PPVItemsType }
     *
     */
    public PPVItemsType createPPVItemsType() {
        return new PPVItemsType();
    }

    /**
     * Create an instance of {@link PPVItemsType.PPVItem }
     *
     */
    public PPVItemsType.PPVItem createPPVItemsTypePPVItem() {
        return new PPVItemsType.PPVItem();
    }

    /**
     * Create an instance of {@link PPVItemsType.PPVItem.CompleteJournal }
     *
     */
    public PPVItemsType.PPVItem.CompleteJournal createPPVItemsTypePPVItemCompleteJournal() {
        return new PPVItemsType.PPVItem.CompleteJournal();
    }

    /**
     * Create an instance of {@link ViewProperties.GridColumns }
     *
     */
    public ViewProperties.GridColumns createViewPropertiesGridColumns() {
        return new ViewProperties.GridColumns();
    }

    /**
     * Create an instance of {@link Document.Dashboards }
     *
     */
    public Document.Dashboards createDocumentDashboards() {
        return new Document.Dashboards();
    }

    /**
     * Create an instance of {@link Document.Links }
     *
     */
    public Document.Links createDocumentLinks() {
        return new Document.Links();
    }

    /**
     * Create an instance of {@link Document.Projects }
     *
     */
    public Document.Projects createDocumentProjects() {
        return new Document.Projects();
    }

    /**
     * Create an instance of {@link Document.Projects.Project }
     *
     */
    public Document.Projects.Project createDocumentProjectsProject() {
        return new Document.Projects.Project();
    }

    /**
     * Create an instance of {@link Document.Projects.Project.Task }
     *
     */
    public Document.Projects.Project.Task createDocumentProjectsProjectTask() {
        return new Document.Projects.Project.Task();
    }

    /**
     * Create an instance of {@link Document.Projects.Project.Task.ResourceAssignments }
     *
     */
    public Document.Projects.Project.Task.ResourceAssignments createDocumentProjectsProjectTaskResourceAssignments() {
        return new Document.Projects.Project.Task.ResourceAssignments();
    }

    /**
     * Create an instance of {@link Document.Resources }
     *
     */
    public Document.Resources createDocumentResources() {
        return new Document.Resources();
    }

    /**
     * Create an instance of {@link Document.Calendars }
     *
     */
    public Document.Calendars createDocumentCalendars() {
        return new Document.Calendars();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar }
     *
     */
    public Document.Calendars.Calendar createDocumentCalendarsCalendar() {
        return new Document.Calendars.Calendar();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.ExceptedDays }
     *
     */
    public Document.Calendars.Calendar.ExceptedDays createDocumentCalendarsCalendarExceptedDays() {
        return new Document.Calendars.Calendar.ExceptedDays();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.ExceptedDays.ExceptedDay }
     *
     */
    public Document.Calendars.Calendar.ExceptedDays.ExceptedDay createDocumentCalendarsCalendarExceptedDaysExceptedDay() {
        return new Document.Calendars.Calendar.ExceptedDays.ExceptedDay();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.ExceptedDays.ExceptedDay.TimePeriods }
     *
     */
    public Document.Calendars.Calendar.ExceptedDays.ExceptedDay.TimePeriods createDocumentCalendarsCalendarExceptedDaysExceptedDayTimePeriods() {
        return new Document.Calendars.Calendar.ExceptedDays.ExceptedDay.TimePeriods();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.WeekDays }
     *
     */
    public Document.Calendars.Calendar.WeekDays createDocumentCalendarsCalendarWeekDays() {
        return new Document.Calendars.Calendar.WeekDays();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.WeekDays.WeekDay }
     *
     */
    public Document.Calendars.Calendar.WeekDays.WeekDay createDocumentCalendarsCalendarWeekDaysWeekDay() {
        return new Document.Calendars.Calendar.WeekDays.WeekDay();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.WeekDays.WeekDay.TimePeriods }
     *
     */
    public Document.Calendars.Calendar.WeekDays.WeekDay.TimePeriods createDocumentCalendarsCalendarWeekDaysWeekDayTimePeriods() {
        return new Document.Calendars.Calendar.WeekDays.WeekDay.TimePeriods();
    }

    /**
     * Create an instance of {@link Document.Markers }
     *
     */
    public Document.Markers createDocumentMarkers() {
        return new Document.Markers();
    }

    /**
     * Create an instance of {@link Document.WorkspaceProperties }
     *
     */
    public Document.WorkspaceProperties createDocumentWorkspaceProperties() {
        return new Document.WorkspaceProperties();
    }

    /**
     * Create an instance of {@link Document.PrintingProperties }
     *
     */
    public Document.PrintingProperties createDocumentPrintingProperties() {
        return new Document.PrintingProperties();
    }

    /**
     * Create an instance of {@link Document.ResourceUsageDiagram }
     *
     */
    public Document.ResourceUsageDiagram createDocumentResourceUsageDiagram() {
        return new Document.ResourceUsageDiagram();
    }

    /**
     * Create an instance of {@link Document.ProjectPortfolioView }
     *
     */
    public Document.ProjectPortfolioView createDocumentProjectPortfolioView() {
        return new Document.ProjectPortfolioView();
    }

    /**
     * Create an instance of {@link ActiveFilter }
     *
     */
    public ActiveFilter createActiveFilter() {
        return new ActiveFilter();
    }

    /**
     * Create an instance of {@link Hyperlinks }
     *
     */
    public Hyperlinks createHyperlinks() {
        return new Hyperlinks();
    }

    /**
     * Create an instance of {@link StyleProject.GridRowStyle }
     *
     */
    public StyleProject.GridRowStyle createStyleProjectGridRowStyle() {
        return new StyleProject.GridRowStyle();
    }

    /**
     * Create an instance of {@link TimeScale }
     *
     */
    public TimeScale createTimeScale() {
        return new TimeScale();
    }

    /**
     * Create an instance of {@link Callouts.Callout }
     *
     */
    public Callouts.Callout createCalloutsCallout() {
        return new Callouts.Callout();
    }

    /**
     * Create an instance of {@link PPVItemsType.PPVItem.CompleteJournal.CompleteJournalEntry }
     *
     */
    public PPVItemsType.PPVItem.CompleteJournal.CompleteJournalEntry createPPVItemsTypePPVItemCompleteJournalCompleteJournalEntry() {
        return new PPVItemsType.PPVItem.CompleteJournal.CompleteJournalEntry();
    }

    /**
     * Create an instance of {@link ViewProperties.GridColumns.Column }
     *
     */
    public ViewProperties.GridColumns.Column createViewPropertiesGridColumnsColumn() {
        return new ViewProperties.GridColumns.Column();
    }

    /**
     * Create an instance of {@link Document.Dashboards.Dashboard }
     *
     */
    public Document.Dashboards.Dashboard createDocumentDashboardsDashboard() {
        return new Document.Dashboards.Dashboard();
    }

    /**
     * Create an instance of {@link Document.Links.Link }
     *
     */
    public Document.Links.Link createDocumentLinksLink() {
        return new Document.Links.Link();
    }

    /**
     * Create an instance of {@link Document.Projects.Project.Task.ResourceAssignments.ResourceAssignment }
     *
     */
    public Document.Projects.Project.Task.ResourceAssignments.ResourceAssignment createDocumentProjectsProjectTaskResourceAssignmentsResourceAssignment() {
        return new Document.Projects.Project.Task.ResourceAssignments.ResourceAssignment();
    }

    /**
     * Create an instance of {@link Document.Resources.Resource }
     *
     */
    public Document.Resources.Resource createDocumentResourcesResource() {
        return new Document.Resources.Resource();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.ExceptedDays.ExceptedDay.TimePeriods.TimePeriod }
     *
     */
    public Document.Calendars.Calendar.ExceptedDays.ExceptedDay.TimePeriods.TimePeriod createDocumentCalendarsCalendarExceptedDaysExceptedDayTimePeriodsTimePeriod() {
        return new Document.Calendars.Calendar.ExceptedDays.ExceptedDay.TimePeriods.TimePeriod();
    }

    /**
     * Create an instance of {@link Document.Calendars.Calendar.WeekDays.WeekDay.TimePeriods.TimePeriod }
     *
     */
    public Document.Calendars.Calendar.WeekDays.WeekDay.TimePeriods.TimePeriod createDocumentCalendarsCalendarWeekDaysWeekDayTimePeriodsTimePeriod() {
        return new Document.Calendars.Calendar.WeekDays.WeekDay.TimePeriods.TimePeriod();
    }

    /**
     * Create an instance of {@link Document.Markers.Marker }
     *
     */
    public Document.Markers.Marker createDocumentMarkersMarker() {
        return new Document.Markers.Marker();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.schemas.conceptdraw.com/cdprj/document.xsd", name = "OutlineNumber")
    public JAXBElement<String> createOutlineNumber(String value) {
        return new JAXBElement<>(_OutlineNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Priority }{@code >}
     *
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Priority }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.schemas.conceptdraw.com/cdprj/document.xsd", name = "Priority")
    @XmlJavaTypeAdapter(Adapter7 .class)
    public JAXBElement<Priority> createPriority(Priority value) {
        return new JAXBElement<>(_Priority_QNAME, Priority.class, null, value);
    }

}
