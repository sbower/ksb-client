
package org.kuali.rice.kew.v2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.kuali.rice.kew.v2_0 package. 
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

    private final static QName _GetNote_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "getNote");
    private final static QName _Update_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "update");
    private final static QName _DeleteNote_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "deleteNote");
    private final static QName _DeleteNoteResponse_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "deleteNoteResponse");
    private final static QName _CreateNoteResponse_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "createNoteResponse");
    private final static QName _CreateNote_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "createNote");
    private final static QName _GetNotesResponse_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "getNotesResponse");
    private final static QName _UpdateResponse_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "updateResponse");
    private final static QName _GetNotes_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "getNotes");
    private final static QName _GetNoteResponse_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "getNoteResponse");
    private final static QName _Note_QNAME = new QName("http://rice.kuali.org/kew/v2_0", "note");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.kuali.rice.kew.v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNote }
     * 
     */
    public GetNote createGetNote() {
        return new GetNote();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link GetNotesResponse }
     * 
     */
    public GetNotesResponse createGetNotesResponse() {
        return new GetNotesResponse();
    }

    /**
     * Create an instance of {@link GetNoteResponse }
     * 
     */
    public GetNoteResponse createGetNoteResponse() {
        return new GetNoteResponse();
    }

    /**
     * Create an instance of {@link DeleteNoteResponse }
     * 
     */
    public DeleteNoteResponse createDeleteNoteResponse() {
        return new DeleteNoteResponse();
    }

    /**
     * Create an instance of {@link GetNotesResponse.Notes }
     * 
     */
    public GetNotesResponse.Notes createGetNotesResponseNotes() {
        return new GetNotesResponse.Notes();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link CreateNote }
     * 
     */
    public CreateNote createCreateNote() {
        return new CreateNote();
    }

    /**
     * Create an instance of {@link GetNotes }
     * 
     */
    public GetNotes createGetNotes() {
        return new GetNotes();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link DeleteNote }
     * 
     */
    public DeleteNote createDeleteNote() {
        return new DeleteNote();
    }

    /**
     * Create an instance of {@link CreateNoteResponse }
     * 
     */
    public CreateNoteResponse createCreateNoteResponse() {
        return new CreateNoteResponse();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "getNote")
    public JAXBElement<GetNote> createGetNote(GetNote value) {
        return new JAXBElement<GetNote>(_GetNote_QNAME, GetNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "deleteNote")
    public JAXBElement<DeleteNote> createDeleteNote(DeleteNote value) {
        return new JAXBElement<DeleteNote>(_DeleteNote_QNAME, DeleteNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "deleteNoteResponse")
    public JAXBElement<DeleteNoteResponse> createDeleteNoteResponse(DeleteNoteResponse value) {
        return new JAXBElement<DeleteNoteResponse>(_DeleteNoteResponse_QNAME, DeleteNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "createNoteResponse")
    public JAXBElement<CreateNoteResponse> createCreateNoteResponse(CreateNoteResponse value) {
        return new JAXBElement<CreateNoteResponse>(_CreateNoteResponse_QNAME, CreateNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "createNote")
    public JAXBElement<CreateNote> createCreateNote(CreateNote value) {
        return new JAXBElement<CreateNote>(_CreateNote_QNAME, CreateNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "getNotesResponse")
    public JAXBElement<GetNotesResponse> createGetNotesResponse(GetNotesResponse value) {
        return new JAXBElement<GetNotesResponse>(_GetNotesResponse_QNAME, GetNotesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "getNotes")
    public JAXBElement<GetNotes> createGetNotes(GetNotes value) {
        return new JAXBElement<GetNotes>(_GetNotes_QNAME, GetNotes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "getNoteResponse")
    public JAXBElement<GetNoteResponse> createGetNoteResponse(GetNoteResponse value) {
        return new JAXBElement<GetNoteResponse>(_GetNoteResponse_QNAME, GetNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rice.kuali.org/kew/v2_0", name = "note")
    public JAXBElement<NoteType> createNote(NoteType value) {
        return new JAXBElement<NoteType>(_Note_QNAME, NoteType.class, null, value);
    }

}
