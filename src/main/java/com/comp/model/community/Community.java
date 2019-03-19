/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comp.model.community;

import com.comp.model.benchmarkingEvent.BenchmarkingEvent;
import com.comp.model.benchmarkingEvent.BenchmarkingEventFilters;
import com.comp.model.utils.Link;
import com.comp.model.utils.MetricsCategory;
import com.comp.model.utils.ReferenceTool;
import com.comp.service.MongoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author vsundesh
 */
@Document (collection="Community")
public class Community {
    private String _id;
    private String _schema;
    private String name;
    private String acronym;
    private String status;
    private String description;
    private List<String> keywords;
    private List<Link> links;
    @Field("community_contacts")
    private List<String> community_contact_ids;
    private List<MetricsCategory> metrics_categories;
    private List <ReferenceTool> reference_tools;
    private List <BenchmarkingEvent> bEvents;

    
    public Community() {
    }

    public Community(String _id, String _schema, String name, String acronym, String status, String description, List<String> keywords, List<Link> links, List<String> community_contact_ids, List<MetricsCategory> metrics_categories, List<ReferenceTool> reference_tools, List<BenchmarkingEvent> bEvents) {
        this._id = _id;
        this._schema = _schema;
        this.name = name;
        this.acronym = acronym;
        this.status = status;
        this.description = description;
        this.keywords = keywords;
        this.links = links;
        this.community_contact_ids = community_contact_ids;
        this.metrics_categories = metrics_categories;
        this.reference_tools = reference_tools;
        this.bEvents = bEvents;
    }
    
    

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getSchema() {
        return _schema;
    }

    public void setSchema(String _schema) {
        this._schema = _schema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<String> getCommunity_contact_ids() {
        return community_contact_ids;
    }

    public void setCommunity_contact_ids(List<String> community_contact_ids) {
        this.community_contact_ids = community_contact_ids;
    }

    public List<MetricsCategory> getMetrics_categories() {
        return metrics_categories;
    }

    public void setMetrics_categories(List<MetricsCategory> metrics_categories) {
        this.metrics_categories = metrics_categories;
    }

    public List<ReferenceTool> getReference_tools() {
        return reference_tools;
    }

    public void setReference_tools(List<ReferenceTool> reference_tools) {
        this.reference_tools = reference_tools;
    }

    public List<BenchmarkingEvent> getbEvents() {
        return bEvents;
    }

    public void setbEvents(List<BenchmarkingEvent> bEvents) {
        this.bEvents = bEvents;
    }
    
    
}